package com.opensource.jiangbiao.constract.adapter;

public class ThreePin implements Socket{


    @Override
    public void provideElectricity() {
        System.out.println("我是三角插线板，提供电");
    }

    //返回引脚数量
    @Override
    public int getPin() {
        return 3;
    }
}
