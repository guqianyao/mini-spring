package com.gqy.spring.controllers;

public class Bleep {
    String name = "Bleep";

    void setName(String name) {
        this.name = name;
    }

    void backgroundSetName() throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                setName("Blat");
                System.out.println(Thread.currentThread().getName());
            }
        };
        t.start();
        t.join();
        System.out.println(name);

    }

    public static void main(String[] args) throws InterruptedException {
        new Bleep().backgroundSetName();
    }
}
