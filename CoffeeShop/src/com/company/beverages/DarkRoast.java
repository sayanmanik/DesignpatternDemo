package com.company.beverages;

public class DarkRoast extends Beverage
{
    public DarkRoast(){
        desc = "Dark Roast";
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getCost() {
        return 2.99;
    }
}
