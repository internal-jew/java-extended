package com.alevel.bezlutskiy;

/**
 * TODO
 */

        class BinarySearchAlgorithm {
    static int find(int needle, int[] stack, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (stack[mid] < needle) {
                low = mid + 1;
            } else if (stack[mid] > needle) {
                high = mid - 1;
            } else if (stack[mid] == needle) {
                return mid;
            }
        }
        return Integer.MAX_VALUE;
    }
}