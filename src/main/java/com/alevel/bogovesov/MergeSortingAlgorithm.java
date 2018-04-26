package com.alevel.bogovesov;

import com.alevel.lecture3.SortingAlgorithm;

/**
 * The merge sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        int[] resultArray = mergeSort(source, 0, source.length);
        return resultArray;
    }

    private int[] mergeSort(int[] numbers, int minIndex, int maxIndex) {
        if (minIndex + 1 < maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;

            mergeSort(numbers, minIndex, midIndex);
            mergeSort(numbers, midIndex, maxIndex);

            int sizeOfTempArray = maxIndex - minIndex;
            int[] tempArray = new int[sizeOfTempArray];

            int i = minIndex;
            int j = midIndex;

            for (int k = 0; k < sizeOfTempArray; k++) {
                if ((j >= maxIndex) || ((i < midIndex) && (numbers[i] < numbers[j]))) {
                    tempArray[k] = numbers[i++];
                } else {
                    tempArray[k] = numbers[j++];
                }
            }

            for (int k = 0; k < sizeOfTempArray; k++) {
                numbers[minIndex + k] = tempArray[k];
            }
        }
        return numbers;
    }
}
