package com.example.lld.lld1.concurrency.six_synchronizedMethod;

public class Count {
    int value;

    public synchronized void updateValue(int i){
        value += i;
    }
}
