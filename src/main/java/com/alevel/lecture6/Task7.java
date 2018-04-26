package com.alevel.lecture6;

import java.util.Arrays;

//7. Дан одномерный массив чисел.
// Найти количество различных чисел этого массива.

public class Task7 {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 3, 2};
        findNumbers(array);
    }

    public static void findNumbers(int[] arr) {
        int counter = 0;
        int[] mass = Arrays.copyOf(arr, arr.length);
        Arrays.sort(mass);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                counter++;
            }
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            counter++;
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println("mass length = " + arr.length + "; numbers = " + counter);
    }


}
