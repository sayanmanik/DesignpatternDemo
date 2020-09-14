package com.company.pizzaIngredient;


import com.company.items.cheese.Cheese;
import com.company.items.cheese.ReggianoCheese;
import com.company.items.clams.Clams;
import com.company.items.clams.FreshClams;
import com.company.items.dough.Dough;
import com.company.items.dough.ThinCrustDough;
import com.company.items.pepperoni.Pepperoni;
import com.company.items.pepperoni.SlicedPepperoni;
import com.company.items.sauce.MarinaraSauce;
import com.company.items.sauce.Sauce;
import com.company.items.veggies.*;

public class NYPizzaIngredientFactory implements  PizzaIngredientFactory
{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };

        return veggies;
    }

    @Override
    public Pepperoni createPepporoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
