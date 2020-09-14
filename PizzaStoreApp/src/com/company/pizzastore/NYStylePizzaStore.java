package com.company.pizzastore;

import com.company.pizza.*;
import com.company.pizzaIngredient.NYPizzaIngredientFactory;
import com.company.pizzaIngredient.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore{

    Pizza pizza=null;
    PizzaIngredientFactory ingredientFactory =
            new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if(type.equals("pepperoni")){
           pizza = new PepperoniPizza(ingredientFactory);
           pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
