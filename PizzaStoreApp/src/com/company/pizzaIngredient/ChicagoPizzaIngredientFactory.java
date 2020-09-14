package com.company.pizzaIngredient;

import com.company.items.cheese.Cheese;
import com.company.items.cheese.MozzarellaCheese;
import com.company.items.clams.Clams;
import com.company.items.clams.FrozenClam;
import com.company.items.dough.Dough;
import com.company.items.dough.ThickCrustDough;
import com.company.items.pepperoni.Pepperoni;
import com.company.items.pepperoni.SlicedPepperoni;
import com.company.items.sauce.PlumTomatoSauce;
import com.company.items.sauce.Sauce;
import com.company.items.veggies.BlackOliver;
import com.company.items.veggies.EggPlant;
import com.company.items.veggies.Spinach;
import com.company.items.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new BlackOliver(),
                new Spinach(),
                new EggPlant()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepporoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
