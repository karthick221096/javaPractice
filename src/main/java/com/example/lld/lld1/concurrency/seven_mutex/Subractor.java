package com.example.lld.lld1.concurrency.seven_mutex;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable{

    private Count count;
    private Lock lock;

    public Subractor(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i =1; i<=10000; i++){
            lock.lock();
                count.value -= 1;
            lock.unlock();
        }
    }
}
