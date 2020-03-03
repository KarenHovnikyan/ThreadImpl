package com.company;

class ProduserConsumer {
    private static int balance = 0;
    private static boolean isOdd;

    void producer() throws InterruptedException {

        while (true) {
            if (!isOdd && balance == 0) {
                balance += 10;
                System.out.println(balance);
            }
            isOdd = true;
        }
    }

    void consumer() throws InterruptedException {
        while (true) {
            if (isOdd && balance == 10) {
                balance -= 10;
                System.out.println(balance);
            }
            isOdd = false;
        }
    }
}

