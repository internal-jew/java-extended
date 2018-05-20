package com.alevel.kirsanov;

import com.alevel.lecture3.SortingAlgorithm;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        for (int i = 0; i < source.length-1; i++) {
            int min = source[i];
            int minI = i;
            for (int j = i = 1; j < source.length; j++) {
                if (source[j] < min) {
                    min = source[j];
                    minI = j;
                }

            }
            if (i != min) {
                int tmp = source[i];
                source[i] = source[minI];
                source[minI] = tmp;
            }
        }

        // Здесь необходимо реализовать сортировку выбором.
        return new int[0];
    }
}
