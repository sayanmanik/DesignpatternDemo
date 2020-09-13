package com.company;

import com.company.beverages.Beverage;
import com.company.beverages.DarkRoast;
import com.company.condiments.Mocha;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Beverage beverage = new DarkRoast();
        Beverage mocha1 = new Mocha(beverage);
        Beverage mocha2 = new Mocha(mocha1);

        System.out.println("Description: "+mocha2.getDesc()+"\nCost: "+mocha2.getCost());
    }
}
