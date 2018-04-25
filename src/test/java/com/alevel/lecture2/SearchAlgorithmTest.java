package com.alevel.lecture2;

import com.alevel.usatyi.BinarySearchAlgorithm;
import com.alevel.usatyi.LinearSearchAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for search algorithms.
 *
 * @author Vladyslav Lubenskyi
 */
class SearchAlgorithmTest {
    private static final int NEEDLE = 863600;

    private static final int[] UNSORTED_ARRAY = {3514100, 3220290, 4902915, 2751170, 2415195,
            4735035, 2499275, 1309395, 1508845, 4672675,
            563380, 4699900, 4405020, 3442590, 757550,
            1934235, 3614370, 863600, 4115705, 3151365,
            1020765, 1373635, 2113245, 2571475, 4896780,
            4182260};

    @Test
    void testLinearSearch() {
        boolean result = LinearSearchAlgorithm.find(NEEDLE, UNSORTED_ARRAY);
        assertTrue(result, "The algorithm failed to find an element!");

        result = LinearSearchAlgorithm.find(345, UNSORTED_ARRAY);
        assertFalse(result, "The algorithm found an element that is not there");

        result = LinearSearchAlgorithm.find(345, new int[]{});
        assertFalse(result, "The algorithm found an element in empty array");
    }

    @Test
    void testBinarySearch() {
        final int[] sortedArray = Arrays.copyOf(UNSORTED_ARRAY, UNSORTED_ARRAY.length);
        Arrays.sort(sortedArray);
        boolean result = BinarySearchAlgorithm.find(NEEDLE, sortedArray);
        assertTrue(result, "The algorithm failed to find an element!");

        result = BinarySearchAlgorithm.find(345, sortedArray);
        assertFalse(result, "The algorithm found element that is not there");

        result = LinearSearchAlgorithm.find(345, new int[]{});
        assertFalse(result, "The algorithm found an element in empty array");
    }
}
