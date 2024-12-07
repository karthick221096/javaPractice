package com.example.lld.lld1.concurrency.three_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=1; i<=100; i++){
            executorService.submit(new NumberPrinter(i));
        }
        executorService.shutdown();
    }
}
