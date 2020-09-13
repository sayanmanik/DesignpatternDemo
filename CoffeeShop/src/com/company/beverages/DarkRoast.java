package com.company.beverages;

public class DarkRoast extends Beverage
{
    int size;
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

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
