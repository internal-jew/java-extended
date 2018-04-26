package com.alevel.bogovesov;

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
        int low = 0, high = stack.length, mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (needle == stack[mid]) {
                return true;
            } else {
                if (needle < stack[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
