package com.alevel.mitin.HomeWork4;

//        В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
//        Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит
//        пользователь).

import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter katet a:");
        int a = sc.nextInt();
        System.out.println("Enter katet b:");
        int b = sc.nextInt();
        double area = a * b / 2;
        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.println("hypotenuse = "+hypotenuse);
        double perimeter = a+b+hypotenuse;
        System.out.println("area of triangle = " + area+";");
        System.out.println("Perimeter of triangle = "+perimeter+";");
    }
}
