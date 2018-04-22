package com.alevel.lecture3;

/**
 * The merge sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        int[] a = mergeSort(source, 0, source.length);
        return a;
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

                boolean condition1 = (j >= maxIndex);
                boolean condition2 = false;

                if (!condition1)
                    condition2 = ((i < midIndex) && (numbers[i] < numbers[j]));

                tempArray[k] = condition1 || condition2 ? numbers[i++] : numbers[j++];
            }

            for (int k = 0; k < sizeOfTempArray; k++) {
                numbers[minIndex + k] = tempArray[k];
            }
        }
        return numbers;
    }
}
