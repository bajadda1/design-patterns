package com.ahmed.bajadda.component;

public abstract class Drink {

    private String description;

    public abstract double calculateCost();

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
