package com.company.pizza;

import com.company.pizzaIngredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
    PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory){
       this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();
    }
}
