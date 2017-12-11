package com.opensource.jiangbiao.create.factory;

public class Demo {

    public static void main(String[] args){
        AnimalFactory animalFactory=new AnimalFactory();
        Animal pig = animalFactory.getAnimal("pig");
        Animal dog = animalFactory.getAnimal("dog");
        Animal cat = animalFactory.getAnimal("cat");
        pig.eat();
        dog.eat();
        cat.eat();
    }
}
