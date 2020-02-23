package com.company;

import java.util.ArrayList;

class ProduserConsumer {
    private static int count = 0;
    private ArrayList<Integer> list = new ArrayList<>();

     void producer() throws InterruptedException {
        while (true) synchronized (this) {
            while (list.size() == 10) {
                wait();
            }

            list.add(count);
            System.out.println("producer" + " " + list.get(count));
            count++;

            notify();
            Thread.sleep(500);
        }
    }

    void consumer() throws InterruptedException {
        while (true) { synchronized (this) {
                if (list.size() == 0) {
                    wait();
                }
                count--;
                System.out.println("costumer" + " " + list.get(count));
                list.remove(count);

                notify();
                Thread.sleep(500);
            }

        }
    }
}
