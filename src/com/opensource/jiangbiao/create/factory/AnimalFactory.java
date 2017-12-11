package com.opensource.jiangbiao.create.factory;

public class AnimalFactory {

    public Animal getAnimal(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(type.equalsIgnoreCase("pig")){
            return new Pig();
        }else if(type.equalsIgnoreCase("dog")){
            return new Dog();
        }
        return null;
    }
}
