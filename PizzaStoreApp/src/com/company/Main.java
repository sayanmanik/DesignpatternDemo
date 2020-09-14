package com.company;

import com.company.pizza.Pizza;
import com.company.pizzastore.ChicagoStylePizzaStore;
import com.company.pizzastore.NYStylePizzaStore;
import com.company.pizzastore.PizzaStore;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Sayan ordered "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Manik ordered "+pizza.getName());
    }
}
