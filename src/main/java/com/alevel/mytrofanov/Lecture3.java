package com.alevel.lecture3;

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
//        int[] stack = readArrayFromFile();
        int[] stack = generateArray(200000);
        System.out.println(format("We're an array of size %d", stack.length));

        final long selectionStartedAt = System.currentTimeMillis();
        new SelectionSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long selectionEndedAt = System.currentTimeMillis();

        System.out.println(format("Selection sort took %d ms", selectionEndedAt - selectionStartedAt));

        final long mergeStartedAt = System.currentTimeMillis();
        new MergeSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long mergeEndedAt = System.currentTimeMillis();

        System.out.println(format("Merge soort took  %d ms", mergeEndedAt - mergeStartedAt));

        final long quickStartedAt = System.currentTimeMillis();
        new QuickSortingAlgorithm().sort(Arrays.copyOf(stack, stack.length));
        final long quickEndedAt = System.currentTimeMillis();

        System.out.println(format("Quick sort took %d ms", quickEndedAt - quickStartedAt));
    }

    private static int[] readArrayFromFile() {
        final IntegersFile integersFile = IntegersFile.open(FILENAME);
        return integersFile.parseToArray();
    }

    static void printArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    static int [] generateArray(int size){
        int array[] = new int [size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }
        return array;
    }
}
