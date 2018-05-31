package com.alevel.mitin.Lecture11;

public class main {
    public static void main(String[] args) {
        Letter ll = new Letter();
        Letter.Address lA = new Letter().new Address();
        Letter.Address l2 = new Letter().new Address();
        System.out.println(1);
        final Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("run");
                    }
                }
//                new Action()
        );
        System.out.println(2);
        thread.run();
        System.out.println(3);
    }

//    public static class Action implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("run");
//        }
//    }
}
