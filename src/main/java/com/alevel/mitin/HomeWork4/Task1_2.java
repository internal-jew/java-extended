package com.alevel.mitin.HomeWork4;

//        Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2
//        экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля
//        объектов.

class Dog {
    private String name, says;
    Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
    String getName() {
        return name;
    }
    String getSays() {
        return says;
    }
}


public class Task1_2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", "Ruff!");
        Dog dog2 = new Dog("Scruffy", "Wurf!");

        System.out.println(dog1.getName() + " says " + dog1.getSays());
        System.out.println(dog2.getName() + " says " + dog2.getSays());
    }
}
