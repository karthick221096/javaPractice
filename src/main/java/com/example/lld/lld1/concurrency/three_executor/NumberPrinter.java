package com.example.lld.lld1.concurrency.three_executor;

public class NumberPrinter implements Runnable{

    private int i;

    public NumberPrinter(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("value of i : "+i+" from the thread : "+Thread.currentThread().getName());
    }
}
