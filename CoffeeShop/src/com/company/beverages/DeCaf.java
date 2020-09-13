package com.company.beverages;

public class DeCaf extends Beverage {


    DeCaf(){
        desc = "decaf";
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getCost() {
        return 2.75;
    }
}
