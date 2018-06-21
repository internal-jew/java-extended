package com.alevel.mitin.Practice1;

//6. Дано действительное число x и массив A[n].
// В массиве найти два члена, среднее
// рифметическое которых ближе всего к x.

import java.util.Arrays;
import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
//        float aa = 5, bb = 6, cc = (5f + 6f) / 2f;
//        System.out.println(cc);
        int x;
        int[] arr = {0, 3, 4, 7, 8, 10, 12, 25, 29, 35, 64, 70};
        Scanner sc = new Scanner(System.in);
//        int[] mass = new int[10];
//        System.out.println("Pleas enter mass of int length = 10");
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = sc.nextInt();
//        }
        System.out.println("Enter X: ");
        x = sc.nextInt();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        findMiddleArithmetic(arr, x);
    }
    private static void findMiddleArithmetic(int A[], int x) {
        int first = A[0], second = A[1];
        double average = ((A[0] + A[1]) / 2f), minimum = Math.abs(x - average);
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (j == i) continue;
                average = Math.abs(x - ((A[i] + A[j]) / 2f));
//                float abs = Math.abs(x - ((A[i] + A[j]) / 2f));
                if (average <= minimum) {
                    minimum = average;
                    first = A[i];
                    second = A[j];
                    System.out.println("A[i]: " + A[i] + "; A[j]: " + A[j] + "; dist: " + average);
                }
                if (average == 0) {
                    System.out.println("XXX A[i]: " + A[i] + "; A[j]: " + A[j] + " dist: " + average);
                    return;
                }
            }
//            if (minimum == 0) break;
        }
        average = (first + second) / 2f;
        System.out.println("Left - A[i] = " + first + "; A[j] = "
                + second + "; middle = " + average);
    }
}