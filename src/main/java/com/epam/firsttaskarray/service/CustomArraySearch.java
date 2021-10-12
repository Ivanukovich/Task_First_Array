package com.epam.firsttaskarray.service;

import com.epam.firsttaskarray.entity.CustomArray;

import java.util.stream.IntStream;

public class CustomArraySearch {

    public int findMin(CustomArray array){
        return IntStream
                .of(array.getArray())
                .min()
                .getAsInt();
    }

    public int findMax(CustomArray array){
        return IntStream
                .of(array.getArray())
                .max()
                .getAsInt();
    }

    public int findPositiveAmount(CustomArray array){
        return IntStream
                .of(array.getArray())
                .filter(number -> number > 0)
                .sum();
    }

    public int findNegativeAmount(CustomArray array){
        return IntStream
                .of(array.getArray())
                .filter(number -> number < 0)
                .sum();
    }
}
