package com.company.pizza;

import com.company.pizzaIngredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza
{

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory factory){
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
