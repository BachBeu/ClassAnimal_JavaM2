package com.Bach;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken gáy: ò ó o ò ó o";
    }

    @Override
    public String howToEat(){
        return "could be fried";
    }
}
