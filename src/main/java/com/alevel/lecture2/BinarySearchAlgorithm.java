package com.alevel.lecture2;

import java.util.Arrays;

/**
 * TODO
 */
class BinarySearchAlgorithm {

    static boolean find(int needle, int[] stack) {
        int low = 0;
        int high = stack.length;

        while (stack.length != 1) {
            int mid = (low + high) / 2;

            if (needle < stack[mid]) {
                stack = Arrays.copyOfRange(stack, low, mid);

                return stack.length != 1 || find(needle, stack);

            } else {
                stack = Arrays.copyOfRange(stack, mid, high);

                return stack.length != 1 || find(needle, stack);
            }
        }
        return false;
    }
}
