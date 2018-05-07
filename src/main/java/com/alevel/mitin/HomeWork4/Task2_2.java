package com.alevel.mitin.HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

//        Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
//        первый и второй члены последовательности равны единицам, а каждый следующий — сумме
//        двух предыдущих.
public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci sequence length: ");
        int length = sc.nextInt();
        int[] mass = new int[length];
        mass[0] = 1;
        mass[1] = 1;
        for (int i = 2; i < mass.length; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
        }
        System.out.println("Fibonacci sequence is: ");
        System.out.println(Arrays.toString(mass));
    }
}
