package com.alevel.mitin.ExceptionPractice;

//1. Напишите код, который генерирует и ловит ArrayOutOfBoundsException
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            throw new ArrayIndexOutOfBoundsException("this exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch exception");
        } finally {
            System.out.println("iAm Alive!!!!");
        }
    }
}
