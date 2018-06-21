package com.alevel.mitin.ExceptionPractice;

//2. Напишите код, который будет повторять операцию,
// если она кинула исключение.
public class Task2 {
    private static int counter = 0;

    private static void doSmth() throws Exception {
        System.out.println("doSmth = " + counter);
        throw new Exception("Something wrong");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                doSmth();
            } catch (Exception e1) {
                if (counter >= 10) break;
            }
            counter++;
        }
    }
}
