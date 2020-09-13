package com.company.condiments;

import com.company.beverages.Beverage;

public class Mocha extends CondimentDecorator
{
    Beverage beverage;
    public Mocha(Beverage b){
        beverage = b;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.5;
    }
}
