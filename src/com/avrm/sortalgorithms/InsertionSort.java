package com.avrm.sortalgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22, 2};

        for (int j = 0; j < arr.length; j++) {
            int key = arr[j];
            int i = j-1;

            while (i >=0 &&  arr[i] > key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }


        System.out.println(Arrays.toString(arr));
    }




}
