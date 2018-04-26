package com.alevel.lecture6;

//8. Задан целочисленный массив размерности N.
// Есть ли среди элементов массива простые числа?
// Если да, то вывести номера этих элементов.

public class Task8 {

    public static void main(String[] args) {
        int[] arr = {0, 33, 1, 2, 25, 3, 4, 4, 5, 4, 6, 7, 4, 8, 9, 10, 11, 13, 17, 19, 23,};
        findSimpleNumbers(arr);
    }

    static boolean simple(int sn) {
        if (sn != 0 && sn != 1) {
            for (int j = 2; j < sn; j++) {
                if (sn % j == 0) {
                    return false;
                }
            }
            return true;
        } else return false;
    }

    static void findSimpleNumbers(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] != 1) {
                if (simple(array[i])) {
//                    System.out.println("i = " + i + "; arr =" + array[i]);
                    sb.append(i);
                    sb.append(", ");
                }
            }

        }
        System.out.println(sb.toString());
    }
}
