package com.alevel.mitin.HomeWork4;

import java.util.Arrays;

//        Создать класс, который будет хранить в одной целочисленной переменной несколько
//        значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы
//        получения и добавления параметров отдельно.
public class Task1_8 {

    private int values;

    public static void main(String[] args) {
        Task1_8 t = new Task1_8();
        t.setValues(18, 250, 200);
        int [] mass = t.getValues();
//        System.out.println(Arrays.toString(t.getValues()));
        System.out.println("Age = "+mass[0]);
        System.out.println("Weight = "+mass[1]);
        System.out.println("Height = "+mass[2]);
    }

    private static String toEight(String str, int n) {
        if (str.length() < n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < (n - str.length()); i++) {
                sb.append("0");
            }
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    private void setValues(int age, int weight, int height) {
        String bAge = toEight(Integer.toBinaryString(age), 8);
        String bWeight = toEight(Integer.toBinaryString(weight), 8);
        String bHeight = toEight(Integer.toBinaryString(height), 8);
        this.values = Integer.valueOf((bAge + bHeight + bWeight), 2);

        System.out.println(bAge + " length = " + bAge.length() + "; Age = " + Integer.valueOf(bAge, 2));
        System.out.println(bWeight + " length = " + bWeight.length() + "; Weight = " + Integer.valueOf(bWeight, 2));
        System.out.println(bHeight + " length = " + bHeight.length() + "; Height = " + Integer.valueOf(bHeight, 2));
        System.out.println("values = " + values + "; binary = " + toEight(Integer.toBinaryString(values), 24));
    }

    private int[] getValues() {
        String str = toEight(Integer.toBinaryString(values), 24);
        String[] mass = new String[3];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i == 7 || i == 15 || i == 23) {
                mass[count] = sb.toString();
                sb.setLength(0);
                count++;
            }
        }
        int iter = 0;
        int[] iMass = new int[3];
        for (String ss : mass) {
//            System.out.println(ss + "; val = "+Integer.valueOf(ss,2));
            iMass[iter] = Integer.valueOf(ss,2);
            iter++;
        }
        return iMass;
    }
}
