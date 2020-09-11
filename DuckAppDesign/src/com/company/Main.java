package com.company;

import com.company.duck.Duck;
import com.company.duck.MallardDuck;
import com.company.duck.RubberDuck;
import com.company.fly.FlyNoWay;
import com.company.fly.FlyWithWings;
import com.company.quack.Quack;
import com.company.quack.Squeak;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Duck mallard = new MallardDuck();
        mallard.setFlyBehaviour(new FlyWithWings());
        mallard.setQuackBehaviour(new Quack());
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        System.out.println("----------------------------");

        Duck rubber = new RubberDuck();
        rubber.setFlyBehaviour(new FlyNoWay());
        rubber.setQuackBehaviour(new Squeak());
        rubber.performFly();
        rubber.performQuack();
        rubber.display();
    }
}
