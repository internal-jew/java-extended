package com.alevel.mitin.Collections;

import java.util.Arrays;

public class MyArrayList<T> {

    Object[] data;
    int size;
    int capacity;

    public MyArrayList() {
        this.data = new Object[10];
        capacity = 10;
    }

    public MyArrayList(int size) {
        this.data = new Object[size];
        capacity = size;
    }

    public void add(int index, T object) {
        if ((size + 1) >= data.length) {
            System.out.println("capacity add of index");
            int newLength = data.length+data.length/2;
            Object[] newArray = new Object[newLength];
            capacity = newLength;
            System.arraycopy(data, 0, newArray, 0, index);
//            System.out.println("Sirst copy: "+(T) newArray.toString());
            System.arraycopy(data, index, newArray, index+1, newArray.length-index);
//            System.out.println("Second copy: "+(T) newArray.toString());
            newArray[index] = object;
            data = newArray;
        }else {
            System.out.println("add of index ");
            System.arraycopy(data, index-1 , data, index, size-index+1);
            data[index] = object;
        }
        size++;
    }

    public void add(T object) {
        if (size >= data.length) {
            System.out.println("Capacity add");
            int newLength = data.length + data.length / 2;
            capacity = newLength;
            data = Arrays.copyOf(data, newLength);
            data[size]=object;
        } else {
            System.out.println("add ");
            data[size] = object;
        }
        size++;
    }

    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
//            System.out.println(data[i].getClass().getNameString());
            if (data[i].equals(object)) return true;
        }
        return false;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public T remove(int i) {
        T t = (T) data[i];
//        System.arraycopy(data, 0, newArray, 0, index);
//        System.arraycopy(data, 0, newArray, 0, index);
        data = null;
        size--;
        return t;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
