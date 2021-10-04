package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;

public class CustomArrayCalculation {
    public int findSum(CustomArray array){
        int []arrayData = array.getArray();
        int sum = 0;
        for (int i = 0; i < arrayData.length; ++i){
            sum += arrayData[i];
        }
        return sum;
    }

    public double findMedian(CustomArray array){
        int []arrayData = array.getArray();
        double sum = 0;
        for (int i = 0; i < arrayData.length; ++i){
            sum += arrayData[i];
        }
        return sum/array.getSize();
    }
}
