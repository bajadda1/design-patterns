package com.ahmed.bajadda.decorator.impl;

import com.ahmed.bajadda.component.Drink;
import com.ahmed.bajadda.decorator.DecoratorAbstract;

public class Chocolate extends DecoratorAbstract {

    public Chocolate(Drink drink) {
        super(drink);
    }


    @Override
    public double calculateCost() {
        return 2 + this.getDrink().calculateCost();
    }

    @Override
    public String getDescription() {
        return this.getDrink().getDescription() + " with 'chocolate decorator'";
    }
}
