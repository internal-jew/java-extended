package com.alevel.mitin;


class BinarySearchAlgorithm {

    static boolean find(int needle, int[] stack) {

        int left = 0;
        int right = stack.length;
        int middle;


        while (true) {
            middle = (left + right) / 2;
            // условие нахождения искомого значения
            if (stack[middle] == needle) {
                return true;
            }
            // условия смещения границ для поиска
            if (stack[middle] < needle) {
                left = middle + 1;
            } else
                right = middle;
            // условие выхода при отсутствии искомого значения
            if (left >= right) {
                return false;
            }
        }
    }
}
