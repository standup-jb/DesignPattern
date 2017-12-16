package com.opensource.jiangbiao.constract.proxy;

import com.opensource.jiangbiao.constract.filter.Person;

public class Boss implements Worker{

    private String name;

    public Boss(String name){
        this.name = name;
    }

    @Override
    public void writeDocument() {
        System.out.println("I am "+name);
        System.out.println("Boss write document");
    }
}
