package com.alevel.mitin.Collections;

public class Cats {
    private String name;
    private int age;

    public String getNameString() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this.getClass().getName().equals(obj.getClass().getName())){
            Cats cc = (Cats)obj;
            return cc.getNameString().equals(this.name);
        }
        return false ;
    }
}
