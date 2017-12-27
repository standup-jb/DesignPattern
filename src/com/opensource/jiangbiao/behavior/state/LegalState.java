package com.opensource.jiangbiao.behavior.state;

public class LegalState implements State{

    @Override
    public void enchashment() {
        System.out.println("我是合法账号,取钱没问题");
    }
}
