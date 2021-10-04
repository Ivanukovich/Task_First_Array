package com.epam.firsttaskarray.entity;

import java.util.Arrays;
import java.util.List;

public class CustomArray {
    private int []array;

    public CustomArray(int... array){
        this.array = Arrays.copyOf(array, array.length);
    }

    public CustomArray(){
    }

    public void setArray(int... array){
        this.array = Arrays.copyOf(array, array.length);
    }

    public void setArray(List<Integer> list){
        this.array = new int[list.size()];
        for (int i = 0; i < list.size(); ++i){
            this.array[i] = list.get(i);
        }
    }

    public int []getArray(){
        return Arrays.copyOf(array, array.length);
    }

    public int getSize(){
        return array.length;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; ++i){
            output.append(array[i]);
            if (i < array.length + 1){
                output.append(", ");
            }
        }
        return String.valueOf(output);
    }

    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        CustomArray object = (CustomArray) o;
        int []currentArray = this.getArray();
        int []otherArray = this.getArray();
        if (currentArray.length == otherArray.length) {
            for (int i = 0; i < this.getSize(); ++i){
                if (currentArray[i] != otherArray[i]){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
