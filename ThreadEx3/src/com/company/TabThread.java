package com.company;

public class TabThread implements Runnable{

    private int start;
    private int end;
    private int[] tab;

    public TabThread(int start, int end, int[] tab) {
        this.start = start;
        this.end = end;
        this.tab = tab;
    }

    @Override
    public void run() {

        for(int i = start; i<= end; i++) {
            tab[i]=i*i;
            System.out.println("Result: "+tab[i]);
        }



    }
}
