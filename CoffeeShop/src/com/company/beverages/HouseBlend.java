package com.company.beverages;

public class HouseBlend extends Beverage
{

    HouseBlend(){
        desc = "";
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
