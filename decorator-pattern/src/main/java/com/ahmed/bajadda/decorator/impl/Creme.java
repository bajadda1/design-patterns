package com.ahmed.bajadda.decorator.impl;

import com.ahmed.bajadda.component.Drink;
import com.ahmed.bajadda.decorator.DecoratorAbstract;

public class Creme extends DecoratorAbstract {
    public Creme(Drink drink) {
        super(drink);
    }

    @Override
    public double calculateCost() {
        return 1.5 + this.getDrink().calculateCost();
    }

    @Override
    public String getDescription() {
        return this.getDrink().getDescription() + " with 'creme decorator'";
    }
}
