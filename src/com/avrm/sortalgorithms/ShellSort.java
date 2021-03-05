package com.avrm.sortalgorithms;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22, 2};
        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap /=2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while (j >= gap && arr[j-gap] > newElement) {
                    arr[i] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
    }
}
