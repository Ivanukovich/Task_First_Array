package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayEditor {
    private static final Logger logger = LogManager.getLogger();

    public void setElementAt(CustomArray customArray, int index, int newElement) throws CustomException {
        if (index >= 0 && index < customArray.getSize()) {
            int[] arrayData = customArray.getArray();
            arrayData[index] = newElement;
            customArray.setArray(arrayData);
        } else {
            logger.error("index is out of range");
        }
    }
}
