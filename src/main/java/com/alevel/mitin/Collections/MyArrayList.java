package com.alevel.mitin.Collections;

import java.util.Arrays;

public class MyArrayList<T> {

    T[] data;
    int size;
    int capacity;

    public MyArrayList() {
        this.data = getArray(10);
        capacity = 10;
    }

    public MyArrayList(int size) {
        this.data = getArray(size);
        capacity = size;
    }

    private T[] getArray(int size) {
        return (T[]) new Object[size];
    }

    public void add(int index, T object) {
        if ((size + 1) >= data.length) {
            int newLength = data.length + data.length / 2;
            T[] newArray = getArray(newLength);
            capacity = newLength;
            System.arraycopy(data, 0, newArray, 0, index);
            System.arraycopy(data, index, newArray, index + 1, newArray.length - index);
            newArray[index] = object;
            data = newArray;
        } else {
            System.arraycopy(data, index - 1, data, index, size - index + 1);
            data[index] = object;
        }
        size++;
    }

    public void add(T object) {
        if (size >= data.length) {
            int newLength = data.length + data.length / 2;
            capacity = newLength;
            data = Arrays.copyOf(data, newLength);
            data[size] = object;
        } else {
            data[size] = object;
        }
        size++;
    }

    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(object)) return true;
        }
        return false;
    }

    public T get(int index) {
        return data[index];
    }

    public T remove(int index) {
        T t = data[index];
        System.arraycopy(data, index+1, data, index, size-index);
        size--;
        return t;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
