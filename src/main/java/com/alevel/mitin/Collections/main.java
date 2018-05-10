package com.alevel.mitin.Collections;

public class main {
    public static void main(String[] args) {
        MyArrayList<Cats> li = new MyArrayList<Cats>();

        li.add(new Cats("_1", 1));
        li.add(new Cats("_2", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(new Cats("_3", 1));
        li.add(new Cats("_4", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(new Cats("_5", 1));
        li.add(new Cats("_6", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(new Cats("_7", 1));
        li.add(new Cats("_8", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(new Cats("_9", 1));
        li.add(new Cats("_10", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(new Cats("_11", 1));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);
        li.add(3, new Cats("_12", 999));
        System.out.println(li.toString()+" " + li.size + "; " + li.capacity);

        System.out.println("el 3 get = " + li.get(3).getNameString());
        boolean cont = li.contains(new Cats("_12", 1));
        System.out.println(cont);
        boolean cont2 = li.contains(new Cats("_19", 1));
        System.out.println(cont2);


//        SomeLinkedList<Cats> ls = new SomeLinkedList<Cats>();
//        System.out.println("size = "+ls.size);
//        System.out.println("add first bars 1");
//        ls.addFirst(new Cats("bars 1", 1));
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("size = "+ls.size);
//        System.out.println("add last bars 2");
//        ls.addLast(new Cats("bars 2", 2));
//        System.out.println("size = "+ls.size);
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("add last bars 3");
//        ls.addLast(new Cats("bars 3", 3));
//        System.out.println("size = "+ls.size);
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("add first bars 4");
//        ls.addFirst(new Cats("bars 4", 1));
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("size = "+ls.size);
//
//        System.out.println("remove first name = "+ls.removeFirst().getNameString());
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("size = "+ls.size);
//
//        System.out.println("remove last name = "+ls.removeLast().getNameString());
//        System.out.println("first: "+ls.getFirst().getNameString());
//        System.out.println("Last: "+ls.getLast().getNameString());
//        System.out.println("size = "+ls.size);

//        int oldCapacity = 10000;
//        int cpt = oldCapacity + (oldCapacity >> 1);
//        System.out.println(100 >> 1);
//        System.out.println(100 >> 2);
//        System.out.println(1000 >> 1);
//        System.out.println(1000 >> 2);
//        System.out.println(cpt);
//        int[] data = {1, 1, 1, 2, 3, 1, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(data));
//        int index = 4;
//        int val = 1001;
//        System.arraycopy(data, index , data, index+1, data.length-index-1);
//        data[index] = val;
//        System.out.println(Arrays.toString(data));


    }
}
