package com.company.pizzastore;

import com.company.pizza.ChicagoStyleCheesePizza;
import com.company.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{


    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
