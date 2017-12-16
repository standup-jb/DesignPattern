package com.opensource.jiangbiao.constract.flyweight;

public class Demo {

    private static final String colors[] = {"Red","Green","Blue","White","Black"};

    public static void main(String[] args){
        for(int i=0;i<20;++i){
            Circle circle = (Circle)Factory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor(){
        return colors[(int)(Math.random()*100%colors.length)];
    }

    public static int getRandomX(){
        return (int)(Math.random()*100);
    }

    public static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
