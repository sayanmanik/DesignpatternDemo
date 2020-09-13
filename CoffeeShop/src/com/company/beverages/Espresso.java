package com.company.beverages;

public class Espresso extends Beverage
{

    Espresso(){
        desc = "Espresso";
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getCost() {
        return 1.75;
    }
}
