package com.alevel.lecture3;

/**
 * The quick sort algorithm.
 */
public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        // Здесь необходимо реализовать алгоритм быстрой сортировки.
        // Это необязательное задание повышенной сложности.
        int[] arrRes = quickSort(source, 0, source.length - 1);
        return arrRes;
    }

    private int[] quickSort(int[] array, int low, int high) {

        if (low >= high)
            return array;

        int middle = low + (high - low) / 2;
        int supportingElement = array[middle];

        int i = low, j = high;

        while (i <= j) {
            while (array[i] < supportingElement) {
                i++;
            }

            while (array[j] > supportingElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

        return array;
    }
}
