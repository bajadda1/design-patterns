package com.ahmed.bajadda.observable;

import com.ahmed.bajadda.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void setState(int state);
    void notifyObservers(int state);

}
