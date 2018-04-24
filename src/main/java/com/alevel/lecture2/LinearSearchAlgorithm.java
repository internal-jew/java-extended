package com.alevel.lecture2;

/**
 * TODO
 */
class LinearSearchAlgorithm {

    static boolean find(int needle, int[] stack) {
        int i = 0;
        while (i != stack.length) {
            i++;
            if (needle == stack[i]) return true;
        }
        return false;
    }
}
