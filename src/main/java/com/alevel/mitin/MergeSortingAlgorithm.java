package com.alevel.mitin;

import com.alevel.lecture3.SortingAlgorithm;

/**
 * The mergeSort sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {
    private int[] mergeSort(int[] firstArray, int[] secondArray) {
        int firstArrayEdge = 0;
        int secondArrayEdge = 0;
        int mergedArray[] = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < mergedArray.length; i++) {
            if (firstArrayEdge < firstArray.length && secondArrayEdge < secondArray.length) {
                if (firstArray[firstArrayEdge] < secondArray[secondArrayEdge]) {
                    mergedArray[i] = firstArray[firstArrayEdge];
                    firstArrayEdge++;
                } else {
                    mergedArray[i] = secondArray[secondArrayEdge];
                    secondArrayEdge++;
                }
            } else {
                if (firstArrayEdge >= firstArray.length) {
                    mergedArray[i] = secondArray[secondArrayEdge];
                    secondArrayEdge++;
                } else {
                    mergedArray[i] = firstArray[firstArrayEdge];
                    firstArrayEdge++;
                }
            }
        }
        return mergedArray;
    }
    @Override
    public int[] sort(int[] source) {
        if (source.length <= 1) {
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
