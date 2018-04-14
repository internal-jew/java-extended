package com.alevel.lecture3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for sorting algorithms.
 *
 * @author Vladyslav Lubenskyi
 */
class SortAlgorithmTest {

    private static final int[] UNSORTED_ARRAY = {3514100, 3220290, 4902915, 2751170, 2415195,
            4735035, 2499275, 1309395, 1508845, 4672675,
            563380, 4699900, 4405020, 3442590, 757550,
            1934235, 3614370, 863600, 4115705, 3151365,
            1020765, 1373635, 2113245, 2571475, 4896780,
            4182260};

    @Test
    void testMergeSort() {
        testSortingAlgorithm(new MergeSortingAlgorithm());
    }

    @Test
    void testSelectionSort() {
        testSortingAlgorithm(new SelectionSortingAlgorithm());
    }

    @Test
    void testQuickSort() {
        testSortingAlgorithm(new QuickSortingAlgorithm());
    }

    private void testSortingAlgorithm(SortingAlgorithm algorithm) {
        int[] sorted = algorithm.sort(Arrays.copyOf(UNSORTED_ARRAY, UNSORTED_ARRAY.length));

        for (int i = 0; i < sorted.length - 1; i++) {
            assertTrue(sorted[i] < sorted[i + 1],
                    format("Element on indexes %d and %d are not in the sorted order", i, i + 1));
        }

        int[] sortedEmptyArray = algorithm.sort(new int[0]);
        assertEquals(0, sortedEmptyArray.length);


        int[] sortedArray = Arrays.copyOf(UNSORTED_ARRAY, UNSORTED_ARRAY.length);
        Arrays.sort(sortedArray);

        int[] sortedSortedArray = algorithm.sort(Arrays.copyOf(sortedArray, sortedArray.length));
        for (int i = 0; i < sortedSortedArray.length; i++) {
            assertEquals(sortedArray[i], sortedSortedArray[i]);
        }
    }
}
