package com.example.lld.lld1.concurrency.five_synchronizedKeyword;

public class Subractor implements Runnable{

    private Count count;

    public Subractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i =1; i<=10000; i++){
            synchronized (count){
                count.value -= 1;
            }
        }
    }
}
