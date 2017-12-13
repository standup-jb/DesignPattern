package com.opensource.jiangbiao.constract.adapter;

public class Adapter extends ThreePin implements Socket{



    @Override
    public void provideElectricity() {
        System.out.println("我是转换器:我调用ThreePin产生电");
        super.provideElectricity();
    }

    @Override
    public int getPin() {
        return 2;
    }
}
