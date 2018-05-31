package com.alevel.mitin.Lecture11;

public class Letter {

    static {
        System.out.println("Letter static block");
    }
    public Letter(){
        System.out.println();
        new Address();
        new Address();
    }

    private Address destination;
    private Address sender;
    private String text;

    void send(String addressLine,
              String name,
              String city,
              Country country) {
        destination = new Address();
        destination.addressLine = addressLine;
    }

    public class Address {
        private String addressLine;
        private String name;
        private String city;
        private Country country;
    }

    private enum Country {
        UKRAINE,
        ZIMBABWE
    }

    static class Address2 {
       private int a;

        public Address2() {
            this.a = 1;
        }
    }

}
