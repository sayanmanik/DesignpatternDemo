package com.company.pizzastore;

import com.company.pizza.NYStyleCheesePizza;
import com.company.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{


    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
//        else if(type.equals("veggie")){
//            return new NYStyleVeggiePizza();
//        }else if(type.equals("clam")){
//            return new NYStyleClamPizza();
//        }else if(type.equals("pepperoni")){
//            return new NYStylePepporoniPizza();
//        }

        return null;
    }
}
