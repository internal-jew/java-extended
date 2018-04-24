package com.alevel.lecture3;

import java.util.Arrays;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {

			for (int i = 0; i < source.length; i++) {
				int minValueIndex = i;

				for (int j = i + 1; j < source.length; j++) {
					if (source[j] < source[minValueIndex]) {
						minValueIndex = j;
					}
				}

				int temp = source[i];
				source[i] = source[minValueIndex];
				source[minValueIndex] = temp;

				return source;
			}

			return new int[0];
    }
}
