package com.ahmed.bajadda.decorator;

import com.ahmed.bajadda.component.Drink;

public abstract class DecoratorAbstract extends Drink{

    private Drink drink;

    public DecoratorAbstract(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public abstract String  getDescription();
}
