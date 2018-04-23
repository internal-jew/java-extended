package com.alevel.lecture3;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < source.length; j++) {
                if (source[j] < source[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = source[i];
            source[i] = source[minIndex];
            source[minIndex] = temp;
        }
        return source;
    }
}
