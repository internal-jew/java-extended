package com.alevel.kirsanov;

/**
 * TODO
 */
class BinarySearchAlgorithm {

    static boolean find(int needle, int[] stack) {
        int min = 0;
        int max = stack.length-1;
        int mid;
        while (min < max) {
            mid = (min + max) / 2;
            if (needle == stack[mid]) {
             // System.out.println("needle:" + needle);
                return true;
            } else {
                if (needle < stack[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;

                }
            }
        }

        return false;
    }
}
// Здесь вам необходимо реализовать алгоритм бинарного поиска.
// Ваша задача найти число needle в массиве чисел stack.
// Если ваш алгоритм нашел искомое число, он должен выполнить такой код:
//      return true;
// похожий, на строку "return false", которую вы видите в конце метода.
//
// Переменные needle и stack уже объявлены и заполнены значениями.



