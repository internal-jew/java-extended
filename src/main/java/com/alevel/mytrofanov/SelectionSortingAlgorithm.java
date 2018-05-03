package com.alevel.lecture3;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    public int[] sort(int[] source) {
        // Здесь необходимо реализовать сортировку выбором.
        int indexOfSortedElement = 0;
        while (indexOfSortedElement < source.length) {
            int minValue = source[indexOfSortedElement];
            int minIndex = indexOfSortedElement;
            for (int i = indexOfSortedElement + 1; i < source.length; i++) {
                if (source[i] < minValue) {
                    minValue = source[i];
                    minIndex = i;
                }
            }
            int temp = source[indexOfSortedElement];
            source[indexOfSortedElement] = source[minIndex];
            source[minIndex] = temp;
            indexOfSortedElement++;
        }
//            System.out.println("This is selection sort:");
//            Lecture3.printArray(source);
        return source;
    }
}
