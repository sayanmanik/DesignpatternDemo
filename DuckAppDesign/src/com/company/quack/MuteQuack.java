package com.company.quack;

public class MuteQuack implements QuackBehaviour
{
    @Override
    public void quack() {
        System.out.println("I can neither quack nor squeak");
    }
}
