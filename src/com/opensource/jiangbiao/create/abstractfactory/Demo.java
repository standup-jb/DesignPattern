package com.opensource.jiangbiao.create.abstractfactory;

public class Demo {

    public static void main(String[] args){
       //获取工厂
        AbstractFactory animalFactory = FactoryProvider.getFactory("animal");
        Animal pig = animalFactory.getAnimal("pig");
        pig.eat();

        AbstractFactory colorFactory = FactoryProvider.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();

    }
}
