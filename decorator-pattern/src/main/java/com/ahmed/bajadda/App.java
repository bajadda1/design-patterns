package com.ahmed.bajadda;

import com.ahmed.bajadda.component.Drink;
import com.ahmed.bajadda.component.impl.Coffee;
import com.ahmed.bajadda.decorator.impl.Caramel;
import com.ahmed.bajadda.decorator.impl.Chocolate;
import com.ahmed.bajadda.decorator.impl.Creme;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Drink drink = new Coffee();
        System.out.println("--------------- before decorator ------------------");
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCost());

        System.out.println("--------------- chocolate decorator 1------------------");
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCost());

        System.out.println("--------------- chocolate decorator 2------------------");
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCost());

        System.out.println("--------------- caramel decorator ------------------");
        drink = new Caramel(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCost());

        System.out.println("--------------- creme decorator ------------------");
        drink = new Creme(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCost());

        System.out.println("--------------- all decorators in one line ------------------");

        Drink drink1 = new Caramel(new Chocolate(new Creme(new Coffee())));
        System.out.println(drink1.getDescription());
        System.out.println(drink1.calculateCost());
    }
}
