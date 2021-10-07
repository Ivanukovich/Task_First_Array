package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.customReader.TextReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomArrayEditor {
    private static final Logger logger = LoggerFactory.getLogger(TextReader.class);

    public void setElementAt(CustomArray customArray, int index, int newElement) throws CustomException {
        if (index < customArray.getSize() && index >= 0){
            int []arrayData = customArray.getArray();
            arrayData[index] = newElement;
            customArray.setArray(arrayData);
        }
        else {
            logger.error("index is out of boundaries");
            throw new CustomException("index is out of boundaries");
        }
    }
}
