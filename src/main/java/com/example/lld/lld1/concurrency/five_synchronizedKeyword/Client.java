package com.example.lld.lld1.concurrency.five_synchronizedKeyword;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subractor subractor = new Subractor(count);

        Thread addThread = new Thread(adder);
        Thread subThread = new Thread(subractor);

        addThread.start();
        subThread.start();

        addThread.join();
        subThread.join();

        System.out.println("value : "+count.value);
    }
}
