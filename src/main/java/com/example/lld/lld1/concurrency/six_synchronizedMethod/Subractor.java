package com.example.lld.lld1.concurrency.six_synchronizedMethod;

public class Subractor implements Runnable{

    private Count count;

    public Subractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i =1; i<=10000; i++){
            count.updateValue(-i);
        }
    }
}
