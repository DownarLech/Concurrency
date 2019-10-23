package com.company;

public class Main {

    public static int[] TABLICA = new int[10];

    public static void main(String[] args) {

//
//        Thread watek2 = new Thread(new NamedThread("thread 1"));
//        watek2.start();
//
//        Thread watek3 = new Thread(new NamedThread("thread 2"));
//        watek3.start();
//
//        Thread watek4 = new Thread(new NamedThread("thread 3"));
//        watek4.start();

        Thread pierwszaPolowa = new Thread(new TabThread(0, TABLICA.length/2-1, TABLICA));
        pierwszaPolowa.start();

        Thread drugaPolowa = new Thread(new TabThread(TABLICA.length/2, TABLICA.length-1, TABLICA));
        drugaPolowa.start();

    }
}
