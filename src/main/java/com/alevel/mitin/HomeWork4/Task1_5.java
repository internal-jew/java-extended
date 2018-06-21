package com.alevel.mitin.HomeWork4;

//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
//        переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –
//        вводит пользователь).

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        double first = sc.nextDouble();
        System.out.println("Enter second value: ");
        double second = sc.nextDouble();

//        double distance;
        if (Math.abs(10 - first) > Math.abs(10 - second)) {
            System.out.println("nearest to 10 value is " + second);
        } else
            System.out.println("nearest to 10 value is " + first);


    }

}
