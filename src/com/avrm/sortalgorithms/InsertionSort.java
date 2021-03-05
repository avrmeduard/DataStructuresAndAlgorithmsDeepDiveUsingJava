package com.avrm.sortalgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22, 2};

        insertionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort2(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement ; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
    }
    
    public static void insertionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int key = arr[j];
            int i = j-1;

            while (i >=0 &&  arr[i] > key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }


}
