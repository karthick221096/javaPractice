package com.example.lld.lld1.concurrency.two_multiThread;

public class HelloWorldMultiThread implements Runnable{
    @Override
    public void run() {
        System.out.println("printing Hello world from : "+Thread.currentThread().getName());
    }
}
