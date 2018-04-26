package com.alevel.bogovesov;

/**
 * TODO
 */
class LinearSearchAlgorithm {

    static boolean find(int needle, int[] stack) {
        // Здесь вам необходимо реализовать алгоритм линейного поиска.
        // Ваша задача найти число needle в массиве чисел stack.
        // Если ваш алгоритм нашел искомое число, он должен выполнить такой код:
        //      return true;
        // похожий, на строку "return false", которую вы видите в конце метода.
        //
        // Переменные needle и stack уже объявлены и заполнены значениями.
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == needle)
                return true;
        }
        return false;
    }
}
