package com.alevel.mitin.Uber;


public class Car {

    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.send("");
        } catch (PostalException e) {
            e.printStackTrace();
        }
    }

    public void send(String text) throws PostalException {
        System.out.println("sending exception");
        if (text.isEmpty()) throw new PostalException();
    }
}
