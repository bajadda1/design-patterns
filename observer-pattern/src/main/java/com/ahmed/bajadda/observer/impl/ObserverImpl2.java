package com.ahmed.bajadda.observer.impl;

import com.ahmed.bajadda.observer.Observer;

public class ObserverImpl2  implements Observer {
    int currentState;

    @Override
    public void update(int state) {
        this.currentState = state;
        System.out.println("Observer 2 show the current state of observable 1: " + this.currentState);
    }
}
