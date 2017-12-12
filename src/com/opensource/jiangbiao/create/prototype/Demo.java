package com.opensource.jiangbiao.create.prototype;

public class Demo {

    public static void main(String[] args){
        ConcretePrototype concretePrototype=new ConcretePrototype();
        for(int i=0;i<100;i++){
            ConcretePrototype clonePrototype = (ConcretePrototype)concretePrototype.clone();
            clonePrototype.show();
            System.out.println(clonePrototype.hashCode());
        }
    }
}
