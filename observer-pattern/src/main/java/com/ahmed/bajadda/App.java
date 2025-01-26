package com.ahmed.bajadda;

import com.ahmed.bajadda.observable.Observable;
import com.ahmed.bajadda.observable.impl.ObservableIml1;
import com.ahmed.bajadda.observer.Observer;
import com.ahmed.bajadda.observer.impl.ObserverImpl1;
import com.ahmed.bajadda.observer.impl.ObserverImpl2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //create observable
        Observable observable=new ObservableIml1();
        //create 2 observers
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        //subscribe them
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        //change observable state
        System.out.println("First State=================");

        observable.setState(40);

        System.out.println("Second State=================");

        observable.setState(50);

        System.out.println("Third State without 2nd observer=================");
        observable.removeObserver(observer2);
        observable.setState(30);
    }
}
