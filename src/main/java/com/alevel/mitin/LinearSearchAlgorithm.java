package com.alevel.mitin;


class LinearSearchAlgorithm {

    static boolean find(int needle, int[] stack) {

        for (int aStack : stack) {
            if (aStack == needle) {
                return true;
            }
        }
        return false;
    }
}
