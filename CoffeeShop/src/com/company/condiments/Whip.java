package com.company.condiments;

import com.company.beverages.Beverage;

public class Whip extends CondimentDecorator{


    Beverage beverage;
    Whip(Beverage b){
        beverage = b;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.77;
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
