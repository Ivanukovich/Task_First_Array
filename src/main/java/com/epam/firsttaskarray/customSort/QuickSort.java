package com.epam.firsttaskarray.customSort;

import com.epam.firsttaskarray.entity.CustomArray;

public class QuickSort {
    public void quickSort(CustomArray customArray){
        int []array = customArray.getArray();
        if (array.length > 1) {
            recursive(array, 0, array.length - 1);
        }
        customArray.setArray(array);
    }
    private void recursive(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            recursive(arr, begin, partitionIndex-1);
            recursive(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int save = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = save;
        return i+1;
    }
}
