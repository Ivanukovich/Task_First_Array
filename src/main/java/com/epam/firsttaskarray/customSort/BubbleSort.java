package com.epam.firsttaskarray.customSort;

import com.epam.firsttaskarray.entity.CustomArray;

public class BubbleSort {
    public void bubbleSort(CustomArray customArray){
        int []array = customArray.getArray();
        int save;
        if (array.length > 1) {
            for (int i = 1; i < array.length; ++i) {
                for (int j = 1; j < array.length; ++j) {
                    if (array[j - 1] > array[j]){
                        save = array[j-1];
                        array[j-1] = array[j];
                        array[j] = save;
                    }
                }
            }
        }
        customArray.setArray(array);
    }
}
