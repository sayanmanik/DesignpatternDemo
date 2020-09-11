# DesignpatternDemo

Here I have discussed about **Strategy Design Pattern**. In this application, I have various types of ducks like 
- Mallard duck
- Red head duck
- Rubber duck
Some of them can fly, some of them can quack and all of them can swim. 
So Here I have kept the variable features in the ducks aside. **FlyBehaviour**, **QuackBehaviour** are two interfaces, from where multiple classes are inherited(whether they can fly or not and whether they can quack or not).
Duck class has two methods named **display()** and **swim()** which are fixed for all ducks. To get the fly functions and quack functions, we have **performFly()** and **performQuack()** respectively. 
**FlyBehaviour** and **QuackBehaviour** are in HAS-A relation in Duck.
Duck has multiple variations.

### OO Principles
- Encapsulate what varies
- Favor composition over inhritance
- Program to interfaces, not implementations
