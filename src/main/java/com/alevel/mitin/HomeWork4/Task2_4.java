package com.alevel.mitin.HomeWork4;

import java.io.IOException;

//          Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за
//        сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
//        что справа от двоеточия (например, 02:20, 11:11 или 15:51).
public class Task2_4 {

    public static void main(String[] args) {
        int summ1 = 0, summ2 = 0, counter = 0;
        for (int i = 0; i < 24; i++) {
            summ1 += i;
            for (int j = 0; j < 60; j++) {
                summ2 += j;
                if (summ1 == summ2) {
                    System.out.println(summ1+":"+summ2);
                    counter++;
                }
            }
            summ2 = 0;
        }
        System.out.println(counter);
    }
}
