package com.alevel.mitin.Practice1;

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
        System.out.println("Magic is: " + magicQuadrant(matrix));
    }

    private static boolean magicQuadrant(int[][] arr) {
        int rows[] = new int[arr.length];
        int columns[] = new int[arr.length];
        int diagonals[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            diagonals[0] += arr[i][i];
            diagonals[1] += arr[i][(arr.length - 1) - i];
            for (int j = 0; j < arr[i].length; j++) {
                rows[i] += arr[i][j];
                columns[i] += arr[j][i];
            }
        }

        int mass[] = new int[rows.length+columns.length+diagonals.length];
        System.arraycopy(rows,0,mass,0,rows.length);
        System.arraycopy(columns,0,mass,rows.length,columns.length);
        System.arraycopy(diagonals,0,mass,mass.length-diagonals.length,diagonals.length);

        int temp = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] != temp) {
                return false;
            }
        }
        return true;
    }
}
