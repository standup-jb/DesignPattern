package com.opensource.jiangbiao.constract.bridge;

public class Demo {

    public static void main(String[] args){
        Shape shape=new Circle();
        Color black=new Black();
        shape.setColor(black);
        shape.draw();
        Color white = new White();
        shape.setColor(white);
        shape.draw();

    }
}
