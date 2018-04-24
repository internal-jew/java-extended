package com.alevel.mitin;

import com.alevel.lecture3.SortingAlgorithm;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        if (source.length == 0 || source.length == 1) return source;
        for (int i = 0; i < source.length - 1; i++) {
            int count = i;
            for (int j = i; j < source.length; j++) {
                if (source[j] < source[count]) {
                    count = j;
                }
            }
            if (source[i] > source[count]) {
                int temp = source[i];
                source[i] = source[count];
                source[count] = temp;
            }
        }

        return source;
    }
}
