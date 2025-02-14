package com.ahmed.bajadda.observer.impl;

import com.ahmed.bajadda.observer.Observer;

public class ObserverImpl1 implements Observer {
    int sum = 0;

    @Override
    public void update(int state) {
        this.sum += state;
        System.out.println("Observer 1 sum is: " + this.sum);
    }
}
