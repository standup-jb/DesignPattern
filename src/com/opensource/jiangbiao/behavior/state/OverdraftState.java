package com.opensource.jiangbiao.behavior.state;

public class OverdraftState implements State{

    @Override
    public void enchashment() {
        System.out.println("我是透支账号，无法取现");
    }
}
