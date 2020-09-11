package com.company.duck;

import com.company.fly.FlyBehaviour;
import com.company.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("I can swim");
    }

    public void setFlyBehaviour(FlyBehaviour fly){
        this.flyBehaviour = fly;
    }

    public  void setQuackBehaviour(QuackBehaviour quack){
        this.quackBehaviour = quack;
    }

    public abstract void display();

}
