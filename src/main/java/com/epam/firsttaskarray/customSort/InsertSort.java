package com.epam.firsttaskarray.customSort;

import com.epam.firsttaskarray.entity.CustomArray;

public class InsertSort {
    public void insertSort(CustomArray customArray){
        int []array = customArray.getArray();
        if (array.length > 1){
            int key;
            int j;
            for (int i = 1; i < array.length; ++i){
                key = array[i];
                j = i - 1;
                while (key < array[j]){
                    array[j + 1] = array[j];
                    --j;
                    if (j < 0){
                        break;
                    }
                }
                array[j + 1] = key;
            }
        }
        customArray.setArray(array);
    }
}
