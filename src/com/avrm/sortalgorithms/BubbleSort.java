package com.avrm.sortalgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swapElement(array, j, j+1);
                }
            }
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
