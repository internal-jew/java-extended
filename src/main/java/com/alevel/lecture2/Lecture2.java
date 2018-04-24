package com.alevel.lecture2;

import com.alevel.utils.IntegersFile;
import com.alevel.utils.QuickSortAlgorithm;
import com.alevel.zverev.BinarySearchAlgorithm;

/**
 * The demonstrator of linear and binary search algorithms for the second lecture of
 * Java Extended Course.
 *
 * @author Vladyslav Lubenskyi
 */
public class Lecture2 {

    private static final String FILENAME = "numbers.txt";
    private static final int NEEDLE = 990050;

    /**
     * Launches {@code Lecture2}.
     */
    public static void run() {
        int[] stack = readArrayFromFile();
        System.out.println(String.format("We're an array of size %d", stack.length));
        final int[] sortedArray = QuickSortAlgorithm.sort(stack);

        final long linearStartedAt = System.currentTimeMillis();
        final boolean linearResult = LinearSearchAlgorithm.find(NEEDLE, sortedArray);
        final long linearEndedAt = System.currentTimeMillis();

        if (linearResult) {
            System.out.println(
                    String.format("Linear search found %d in %d ms", NEEDLE,
                            linearEndedAt - linearStartedAt));
        } else {
            System.out.println("Nothing is found");
        }

        final long binaryStartedAt = System.currentTimeMillis();
        final boolean binaryResult = BinarySearchAlgorithm.find(NEEDLE, sortedArray);
        final long binaryEndedAt = System.currentTimeMillis();

        if (binaryResult) {
            System.out.println(
                    String.format("Binary search found %d in %d ms", NEEDLE,
                            binaryEndedAt - binaryStartedAt));
        } else {
            System.out.println("Nothing is found");
        }
    }

    private static int[] readArrayFromFile() {
        final IntegersFile integersFile = IntegersFile.open(FILENAME);
        return integersFile.parseToArray();
    }
}
