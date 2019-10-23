package com.company;

public class NamedThread implements Runnable {
    private String name;

    public NamedThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread name is: "+this.name);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End: "+this.name);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
