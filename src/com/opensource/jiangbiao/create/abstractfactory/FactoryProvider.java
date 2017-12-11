package com.opensource.jiangbiao.create.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("animal")){
            return new AnimalFactory();
        }else if(factory.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
