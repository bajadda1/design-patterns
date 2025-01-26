package com.ahmed.bajadda.observable.impl;

import com.ahmed.bajadda.observable.Observable;
import com.ahmed.bajadda.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableIml1 implements Observable {
    List<Observer> observers = new ArrayList<>();
    int state = 80;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers(state);
    }

    @Override
    public void notifyObservers(int state) {
        for (Observer obs : this.observers) {
            obs.update(state);
        }
    }
}
