package com.opensource.jiangbiao.constract.bridge;

public class Black implements Color{

    @Override
    public void draw(String shape) {
        System.out.println("颜色是黑色的"+shape);
    }
}
