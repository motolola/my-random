package com.motolola.practice.instagram;


import java.util.Arrays;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class MySort {

    public static void main(String[] args)
    {
        int[] arr = {9,1,7,5,6,4,3};
        getInts(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int[] getInts(int[] arr) {
        for (int p = 0; p < arr.length; p++) {
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
