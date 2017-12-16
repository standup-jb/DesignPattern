package com.opensource.jiangbiao.constract.proxy;

public class Demo {

    public static void main(String[] args){
        Boss boss=new Boss("老板");
        boss.writeDocument();

        Secretary secretary=new Secretary("秘书");
        secretary.writeDocument();
    }
}
