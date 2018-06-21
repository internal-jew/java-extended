package com.alevel.mitin.HomeWork4;

import java.util.Arrays;

//          В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
//        неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
//        000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
//        номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
//        567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
//        и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
//        сколько счастливых билетов в одном рулоне?
public class Task2_3 {
    public static void main(String[] args) {

//        isLucky(9562);
        int counter = 0;
        for (int i = 1; i <= 999999; i++) {
            if (isLucky(i)) {
//                System.out.println("isLucky");
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static boolean isLucky(int val) {
        String str = Integer.toString(val);
        if (str.length() < 4) {
            return false;
        } else {
            int[] mass = new int[6];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = 0;
            }
            int difference = 6 - str.length();
            for (int i = 0; i < str.length(); i++) {
                mass[i + difference] = str.charAt(i) - '0';
            }
            int summ1 = 0, summ2 = 0;
            for (int i = 0; i < mass.length / 2; i++) {
                summ1 += mass[i];
                summ2 += mass[i + mass.length / 2];
            }
            return summ1 == summ2;
//            System.out.println(Arrays.toString(mass));
//            System.out.println(summ1 + "  " + summ2);
        }
    }

}
