package com.opensource.jiangbiao.create.singleton;

public class Demo {

    public static void main(String[] args){

        //编译错误，构造函数是private的无法直接new对象
        //SingleObject object=new SingleObject();

        SingleObject object= SingleObject.getInstance();

        SingleObject object1 = SingleObject.getInstance();
        if(object.equals(object1)){
            System.out.println(true);
        }
        object.showMessage();
    }
}
