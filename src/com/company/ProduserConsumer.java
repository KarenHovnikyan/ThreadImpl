
package com.company;

class ProduserConsumer {
    private static volatile int balance = 0;
    private static volatile boolean isvalid;

    void producer() throws InterruptedException {
        while(true) {
            if (!isvalid && balance == 0) {
                balance += 10;
                System.out.println(balance);
            }
            isvalid = true;
        }
    }
    void consumer() throws InterruptedException {
        while(true) {
            if (isvalid && balance == 10) {
                balance -= 10;
                System.out.println(balance);
            }
            isvalid = false;
        }
    }
}
