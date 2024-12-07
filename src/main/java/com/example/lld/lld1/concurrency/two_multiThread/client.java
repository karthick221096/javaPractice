package com.example.lld.lld1.concurrency.two_multiThread;

public class client {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            Thread thread = new Thread(new PrintMultiThreadI(i));
            thread.start();
        }
    }
}
