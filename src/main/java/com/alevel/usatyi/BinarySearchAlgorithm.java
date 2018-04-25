package com.alevel.usatyi;

/**
 * TODO
 */
public class BinarySearchAlgorithm {

    public static boolean find(int needle, int[] stack) {
        // Здесь вам необходимо реализовать алгоритм бинарного поиска.
        // Ваша задача найти число needle в массиве чисел stack.
        // Если ваш алгоритм нашел искомое число, он должен выполнить такой код:
        //      return true;
        // похожий, на строку "return false", которую вы видите в конце метода.
        //
        // Переменные needle и stack уже объявлены и заполнены значениями.

        int currentMiddleOfArray = stack.length / 2;
        int currentTopOfArray = stack.length;
        int currentBottomOfArray = 0;

        boolean isFound = false;

        while (currentTopOfArray != 0 && currentMiddleOfArray != 0) {
            if (needle == stack[currentMiddleOfArray]) {

                isFound = true;
                break;
            }
            if (needle > stack[currentMiddleOfArray]) {

                currentBottomOfArray = currentMiddleOfArray;
                currentMiddleOfArray = (currentTopOfArray - currentMiddleOfArray) / 2 + currentMiddleOfArray;
            }
            if (needle < stack[currentMiddleOfArray]) {

                currentTopOfArray = currentMiddleOfArray;
                currentMiddleOfArray = (currentTopOfArray - currentBottomOfArray) / 2 + currentBottomOfArray;
            }


        }
        return isFound;
    }
}
