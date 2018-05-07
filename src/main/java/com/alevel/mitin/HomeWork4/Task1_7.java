package com.alevel.mitin.HomeWork4;

import java.util.Scanner;

//        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
//        будет находить и выводить на экран вещественные корни квадратного уравнения
//        ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
public class Task1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The solution of the quadratic equation a*x^2+b*x+c = 0");
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        double[] eq = equation(a, b, c);
        if (eq.length == 0) {
            System.out.println("This quadratic equation has no roots");
        } else {
            System.out.println("first root = " + eq[0]);
            System.out.println("second root = " + eq[1]);
        }
    }

    private static double[] equation(int a, int b, int c) {
        double first = b * b;
        double second = 4 * a * c;
        double discriminant = first - second;
        double[] mass = new double[2];
        if (Math.abs(discriminant) >= 0) {
            if (discriminant == 0) {
                double x = (-b + Math.sqrt(discriminant)) / 2;
                mass[1] = x;
                mass[0] = x;
                return mass;
            }
            double xp = (-b + Math.sqrt(discriminant)) / (2 * a);
            double xm = (-b - Math.sqrt(discriminant)) / (2 * a);
            mass[0] = xp;
            mass[1] = xm;
            return mass;
        } else {
//            System.out.println(-1);
            return new double[0];
        }
    }
}
