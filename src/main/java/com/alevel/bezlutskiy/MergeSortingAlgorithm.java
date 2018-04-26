package com.alevel.bezlutskiy;

import com.alevel.lecture3.SortingAlgorithm;

import java.util.Arrays;

/**
 * The merge sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        System.out.println(Arrays.toString(source));
        if (source.length < 2) return source;
        int m = source.length / 2;
        int[] arr1 = Arrays.copyOfRange(source, 0, m);
        int[] arr2 = Arrays.copyOfRange(source, m, source.length);

        return merge(sort(arr1), sort(arr2));
    }

    //слияние двух массивов в один отсортированный
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
}
