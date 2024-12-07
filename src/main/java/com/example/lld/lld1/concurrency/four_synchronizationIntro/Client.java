package com.example.lld.lld1.concurrency.four_synchronizationIntro;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subractor subractor = new Subractor(count);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subractor);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count.value);
//      it won't return synchronized value as 0 because race condition will happen and value won't
//      neither expected 0 nor the constant value.

    }
}
