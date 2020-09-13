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

        double cost = beverage.getCost();
        if(getSize() == beverage.LARGE){
            cost += 3.5;
        }else if(getSize() == beverage.MEDIUM){
            cost += 1.5;
        }else if(getSize() == beverage.SMALL){
            cost += 2.5;
        }

        return cost;
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
