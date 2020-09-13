package com.company.condiments;

import com.company.beverages.Beverage;

public class Soy extends CondimentDecorator
{
    Beverage beverage;

    Soy(Beverage b){
        beverage = b;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Soy";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 3.55;
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
