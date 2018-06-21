package com.alevel.mitin.HomeWork4;

//          Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
//        отрезка [10;99]. Вывести массив на экран.
public class Task2_5 {
    public static void main(String[] args) {
        int [][] matrix = new int[8][5];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = (int) (Math.random()*100);
                if (j==(matrix[i].length-1)) {
                    System.out.print(matrix[i][j]+";");
                }else System.out.print(matrix[i][j]+", ");
            }
            System.out.println();
        }
    }
}
