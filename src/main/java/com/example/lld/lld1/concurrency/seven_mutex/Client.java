package com.example.lld.lld1.concurrency.seven_mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subractor subractor = new Subractor(count, lock);

        Thread addThread = new Thread(adder);
        Thread subThread = new Thread(subractor);

        addThread.start();
        subThread.start();

        addThread.join();
        subThread.join();

        System.out.println("value : "+count.value);
    }
}
