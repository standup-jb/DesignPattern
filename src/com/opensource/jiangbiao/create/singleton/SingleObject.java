package com.opensource.jiangbiao.create.singleton;

public class SingleObject {

    private static SingleObject  instance =new SingleObject();

    //私有构造函数
    private SingleObject(){}

    public static SingleObject getInstance(){

        return instance;
    }

    public void showMessage(){
        System.out.print("Show Message");
    }
}
