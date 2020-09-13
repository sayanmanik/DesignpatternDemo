package com.company.beverages;

public abstract class Beverage {
    String desc= "";
    public static int LARGE = 1;
    public static int MEDIUM = 2;
    public static int SMALL = 3;

    public abstract String getDesc();
    public abstract double getCost();

    public abstract void setSize(int size);
    public abstract int getSize();
;}
