package com.example.lld.lld1.concurrency.one_helloWorld;

public class client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread newthread = new Thread(helloWorldPrinter);
        newthread.start();
        System.out.println("hello world printing from : "+Thread.currentThread().getName());
    }
}
