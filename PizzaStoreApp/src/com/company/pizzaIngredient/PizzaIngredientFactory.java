package com.company.pizzaIngredient;

import com.company.items.cheese.Cheese;
import com.company.items.clams.Clams;
import com.company.items.dough.Dough;
import com.company.items.pepperoni.Pepperoni;
import com.company.items.sauce.Sauce;
import com.company.items.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepporoni();
    public Clams createClam();



}
