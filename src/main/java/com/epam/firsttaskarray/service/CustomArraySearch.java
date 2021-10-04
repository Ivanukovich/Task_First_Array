package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;

public class CustomArraySearch {

    public int findMin(CustomArray array){
        int []arrayData = array.getArray();
        int min = arrayData[0];
        for (int i = 1; i < arrayData.length; ++i){
            if (arrayData[i] < min){
                min = arrayData[i];
            }
        }
        return min;
    }

    public int findMax(CustomArray array){
        int []arrayData = array.getArray();
        int max = arrayData[0];
        for (int i = 1; i < arrayData.length; ++i){
            if (arrayData[i] > max){
                max = arrayData[i];
            }
        }
        return max;
    }

    public int findPositiveAmount(CustomArray array){
        int []arrayData = array.getArray();
        int positiveCounter = 0;
        for (int i = 0; i < arrayData.length; ++i){
            if (arrayData[i] > 0){
                ++positiveCounter;
            }
        }
        return positiveCounter;
    }

    public int findNegativeAmount(CustomArray array){
        int []arrayData = array.getArray();
        int negativeCounter = 0;
        for (int i = 0; i < arrayData.length; ++i){
            if (arrayData[i] < 0){
                ++negativeCounter;
            }
        }
        return negativeCounter;
    }
}
