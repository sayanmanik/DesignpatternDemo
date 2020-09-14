package com.company.pizza;

import com.company.pizzaIngredient.PizzaIngredientFactory;

public class PepperoniPizza  extends Pizza
{

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory factory){
        this.ingredientFactory = factory;
    }



    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
