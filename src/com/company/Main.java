package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ProduserConsumer pc = new ProduserConsumer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consumer();
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
            }
        });
        t1.start();
        t2.start();
    }
}

