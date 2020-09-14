package com.company.pizzastore;

import com.company.pizza.*;
import com.company.pizzaIngredient.ChicagoPizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore{

    Pizza pizza = null;
    ChicagoPizzaIngredientFactory chicagoFactory
            = new ChicagoPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")){
            pizza = new CheesePizza(chicagoFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(chicagoFactory);
            pizza.setName("Chicago Veggie Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(chicagoFactory);
            pizza.setName("Chicago Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(chicagoFactory);
            pizza.setName("Chicago Pepperoni Pizza");
        }
        return pizza;
    }
}
