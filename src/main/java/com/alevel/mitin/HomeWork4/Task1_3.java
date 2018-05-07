package com.alevel.mitin.HomeWork4;

import java.util.Scanner;

//  Создать программу, проверяющую и сообщающую на экран, является ли целое число,
//  записанное в переменную n, чётным либо нечётным (n – вводит пользователь).

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int val = sc.nextInt();
        if (val % 2 == 0) {
            System.out.println("Value is even");
        } else System.out.println("Value is not even");
    }
}
