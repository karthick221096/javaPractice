package com.example.lld.lld1.concurrency.two_multiThread;

public class PrintMultiThreadI implements Runnable{
    private int i;

    public PrintMultiThreadI(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("the value of i : "+i+" printing from "+ Thread.currentThread().getName());
    }
}
