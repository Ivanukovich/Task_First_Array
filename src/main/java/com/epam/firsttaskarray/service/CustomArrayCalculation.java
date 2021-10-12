package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;

import java.util.stream.IntStream;

public class CustomArrayCalculation {
    public int findSum(CustomArray array){
        return IntStream
                .of(array.getArray())
                .sum();
    }

    public double findMedian(CustomArray array){
        double sum = IntStream
                .of(array.getArray())
                .sum();
        return sum/array.getSize();
    }
}
