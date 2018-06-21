package com.alevel.mitin.HomeWork4;

import java.util.Scanner;

//В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую
//и выводящую на экран сумму цифр числа n (n – вводит пользователь).
public class Task1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n:");
        int n = sc.nextInt();
        System.out.println("factorial (n) = " + findSumm(n));
    }

    private static int findSumm(int value) {
        if (value > 1) {
            return (value + findSumm(value - 1));
        } else
            return value;
    }
}
