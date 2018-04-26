package com.alevel.bezlutskiy;

import com.alevel.lecture3.SortingAlgorithm;

import java.util.Arrays;

/**
 * The quick sort algorithm.
 */
public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {

        int arrayStart = 0, arrayEnd = source.length - 1;
        testquickSort(source, arrayStart, arrayEnd);
        System.out.println(Arrays.toString(source));
        return source;
    }

    public static void testquickSort(int array[], int begin, int end){
        int med = (begin + end - 1) / 2;
        System.out.println();
        int i = 0;
        while(begin != med && end != med){
            while (array[begin] <= array[med]){
                System.out.println(begin);
                begin += 1;
            }
            while (array[end] >= array[med]){
                System.out.println(end);
                end -= 1;
            }
            if (begin < end){
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }
            System.out.println(i += 1);
        }

        testquickSort(array, med + 1, end);
        testquickSort(array, begin, med - 1);
    }
}
