package com.opensource.jiangbiao.constract.bridge;

public class White implements Color{

    @Override
    public void draw(String shape) {
        System.out.println("颜色是白色的"+shape);
    }
}
