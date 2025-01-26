package com.ahmed.bajadda.component.impl;

import com.ahmed.bajadda.component.Drink;

public class Coffee extends Drink {
    public Coffee() {
        this.setDescription("Coffe Drink");
    }

    @Override
    public double calculateCost() {
        return 12;
    }
}
