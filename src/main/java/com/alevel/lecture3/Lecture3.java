package com.alevel.lecture3;

import com.alevel.usatyi.QuickSortingAlgorithm;
import com.alevel.usatyi.SelectionSortingAlgorithm;
import com.alevel.utils.IntegersFile;

import java.util.Arrays;

import static java.lang.String.format;

/**
 * The demonstrator of linear and binary search algorithms for the second lecture of
 * Java Extended Course.
 *
 * @author Vladyslav Lubenskyi
 */
public class Lecture3 {

    private static final String FILENAME = "numbers.txt";

    /**
     * Launches {@code Lecture2}.
     */
    public static void run() {
        int[] stack = readArrayFromFile();
        System.out.println(format("We're an array of size %d", stack.length));

        final long selectionStartedAt = System.currentTimeMillis();
        new SelectionSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long selectionEndedAt = System.currentTimeMillis();

        System.out.println(format("Selection sort took %d ms", selectionEndedAt - selectionStartedAt));

        final long mergeStartedAt = System.currentTimeMillis();
        new MergeSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long mergeEndedAt = System.currentTimeMillis();

        System.out.println(format("Merge soort took  %d ms",mergeEndedAt - mergeStartedAt));

        final long quickStartedAt = System.currentTimeMillis();
        new QuickSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long quickEndedAt = System.currentTimeMillis();

        System.out.println(format("Quick sort took %d ms", quickEndedAt - quickStartedAt));
    }

    private static int[] readArrayFromFile() {
        final IntegersFile integersFile = IntegersFile.open(FILENAME);
        return integersFile.parseToArray();
    }
}
