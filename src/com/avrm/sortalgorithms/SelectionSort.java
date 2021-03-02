package com.avrm.sortalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for (int i = arr.length-1; i > 0 ; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            swapElement(arr, largest, i);
        }
    }

    public static void swapElement(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
