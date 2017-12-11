package com.opensource.jiangbiao.create.abstractfactory;

public  class AnimalFactory extends AbstractFactory{

    @Override
    public Animal getAnimal(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("pig")){
            return new Pig();
        }else if(shapeType.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(shapeType.equalsIgnoreCase("dog")){
            return new Dog();
        }
        return null;
    }


    @Override
    Color getColor(String color){
        return null;
    }

}
