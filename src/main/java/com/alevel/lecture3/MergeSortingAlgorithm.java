package com.alevel.lecture3;

import java.util.Arrays;

/**
 * The mergeSort sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {

    private int[] mergeSort(int[] firstArray, int[] secondArray) {
        int firstCounter = 0;
        int secondCounter = 0;
        int mergedArray[] = new int[firstArray.length + secondArray.length];
        for (int iterator = 0; iterator < mergedArray.length; iterator++) {
            if (firstCounter < firstArray.length && secondCounter < secondArray.length) {
                if (firstArray[firstCounter] < secondArray[secondCounter]) {
                    mergedArray[iterator] = firstArray[firstCounter];
                    firstCounter++;
                } else {
                    mergedArray[iterator] = secondArray[secondCounter];
                    secondCounter++;
                }
            } else {
                if (firstCounter >= firstArray.length) {
                    mergedArray[iterator] = secondArray[secondCounter];
                    secondCounter++;
                } else {
                    mergedArray[iterator] = firstArray[firstCounter];
                    firstCounter++;
                }
            }
        }
        return mergedArray;
    }

    @Override
    public int[] sort(int[] source) {

        if (source.length == 1 || source.length == 0) {
            return source;
        } else {
            int leftBound = 0, rightBound = source.length, middle = (leftBound + rightBound) / 2;
            int firstArray[] = new int[middle];
            int secondArray[] = new int[rightBound - middle];
            System.arraycopy(source, leftBound, firstArray, 0, firstArray.length);
            System.arraycopy(source, middle, secondArray, 0, secondArray.length);

            return mergeSort(sort(firstArray), sort(secondArray));
        }
    }
}
