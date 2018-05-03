package com.alevel.lecture2;

/**
 * TODO
 */
class BinarySearchAlgorithm {

    static boolean find(int needle, int[] stack) {
        // Здесь вам необходимо реализовать алгоритм бинарного поиска.
        // Ваша задача найти число needle в массиве чисел stack.
        // Если ваш алгоритм нашел искомое число, он должен выполнить такой код:
        //      return true;
        // похожий, на строку "return false", которую вы видите в конце метода.
        //
        // Переменные needle и stack уже объявлены и заполнены значениями.

        int left = 0;
        int right = stack.length - 1;
        int mid = (stack.length - 1) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (stack[mid] == needle) {
                System.out.println("Index of needle is " + mid);
                return true;
            } else if (needle > stack[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
