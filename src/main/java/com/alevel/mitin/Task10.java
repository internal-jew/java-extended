package com.alevel.mitin;

// 10. Дана целая квадратная матрица n-го порядка.
// Определить, является ли она магическим квадратом,
// т.е. такой, в которой суммы элементов во всех
// строках и столбцах одинаковы.

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        int matrix[][] = {{2, 7, 6},
                          {9, 5, 1},
                          {4, 3, 8}};
//        System.out.println(magickQuadrant(matrix));
        magickQuadrant(matrix);
    }

    private static boolean magickQuadrant(int[][] arr) {

        int summMass[] = new int[arr.length * arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
            for (int j = 0; j < arr[i].length; j++) {
                // even or not
                summMass[i] += arr[i][j];

            }
        }
        System.out.println(Arrays.toString(summMass));
//        if (arr[i].length % 2 != 0) {
//
//        } else {
//
//        }
        return false;
    }

}
