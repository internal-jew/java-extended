package com.alevel.mitin.HomeWork4;

//Создать класс, который содержит int и char (не проинициализированные) и распечатать их
//значения.

class TestClass {
    int first;
    char second;
}

public class Task1_1 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        System.out.println("int = " + tc.first + ";");
        System.out.println("char = " + tc.second + ";");
    }
}
