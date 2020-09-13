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

    @Override
    public void setSize(int size) {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
