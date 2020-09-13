package com.company.condiments;

import com.company.beverages.Beverage;

public class Milk extends CondimentDecorator
{

    Beverage beverage;
    Milk(Beverage b){
        beverage = b;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.05;
    }
}
