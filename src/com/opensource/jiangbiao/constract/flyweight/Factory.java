package com.opensource.jiangbiao.constract.flyweight;

import java.util.HashMap;

public class Factory {

    private static final HashMap<String,Shape> circleMap =new HashMap<>();

    public static Shape getShape(String color){
        Circle circle =(Circle)circleMap.get(color);
        if(circle == null){
            circle =new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Create new circle");
        }
        return circle;
    }
}
