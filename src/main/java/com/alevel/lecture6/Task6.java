package com.alevel.lecture6;

//6. Дано действительное число x и массив A[n].
// В массиве найти два члена, среднее
// рифметическое которых ближе всего к x.

import java.util.Arrays;

class Task6 {
    public static void main(String[] args) {
//        float aa = 5, bb = 6, cc = (5f + 6f) / 2f;
//        System.out.println(cc);
        int x = 17;
        int[] arr = {0, 3, 4, 5, 7, 8, 10, 12, 25, 29, 35, 64, 70};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        findMiddleArithmetic(arr, x);
    }

    public static void findMiddleArithmetic(int A[], int x) {

        int leftCount1 = 0, leftCount2 = 0,
                rightCount1 = 0, rightCount2 = 0;
        float temp = 0, left = x, right = x;

        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                temp = (A[i] + A[j]) / 2f;
                if (temp >= left && temp <= x) {
                    left = temp;
                    leftCount1 = A[i];
                    leftCount2 = A[j];
//                    System.out.println("left = " + left + "; middle = " + temp);
                }
                if (temp <= right && temp >= x) {
                    right = temp;
                    rightCount1 = A[i];
                    rightCount2 = A[j];
//                    System.out.println("right = " + right + "; middle = " + temp);
                }
                if (temp == x) {
//                    System.out.println("A[i] = " + A[i] + "; A[j] = " + A[j]);
                    break;
                }
            }
        }
        if ((left - x) > (right - x)) {
            temp = (rightCount1 + rightCount2) / 2f;
            System.out.println("right - A[i] = " + rightCount1 + "; A[j] = "
                    + rightCount2 + "; middle = " + temp);
        } else {
            temp = (leftCount1 + leftCount2) / 2f;
            System.out.println("Left - A[i] = " + leftCount1 + "; A[j] = "
                    + leftCount2 + "; middle = " + temp);
        }
    }
}
