package com.opensource.jiangbiao.constract.proxy;

public class Secretary implements Worker{

    private Boss boss;
    private String name;

    public Secretary(String name){
        this.name = name;
    }


    @Override
    public void writeDocument() {
        System.out.println("I am "+name);
        System.out.println("I help boss write document");
        if(boss == null){
            boss =new Boss("老板");
        }
        boss.writeDocument();
    }
}
