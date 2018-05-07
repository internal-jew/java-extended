package com.alevel.mitin.HomeWork4;

import java.util.Scanner;

//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
//        цифр (заранее не известно сколько цифр будет в числе).
public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int value = sc.nextInt();
        int iter = value-1;
        while (iter >=1){
            value+= iter;
            iter--;
        }
        System.out.println("Summary value is: "+value);
    }
}
