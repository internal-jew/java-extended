package com.alevel.mitin.Collections;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        SomeLinkedList<Cats> ls = new SomeLinkedList<Cats>();
        System.out.println("size = "+ls.size);
        System.out.println("add first bars 1");
        ls.addFirst(new Cats("bars 1", 1));
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("size = "+ls.size);
        System.out.println("add last bars 2");
        ls.addLast(new Cats("bars 2", 2));
        System.out.println("size = "+ls.size);
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("add last bars 3");
        ls.addLast(new Cats("bars 3", 3));
        System.out.println("size = "+ls.size);
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("add first bars 4");
        ls.addFirst(new Cats("bars 4", 1));
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("size = "+ls.size);

        System.out.println("remove first name = "+ls.removeFirst().getName());
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("size = "+ls.size);

        System.out.println("remove last name = "+ls.removeLast().getName());
        System.out.println("first: "+ls.getFirst().getName());
        System.out.println("Last: "+ls.getLast().getName());
        System.out.println("size = "+ls.size);


    }
}
