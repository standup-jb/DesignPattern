package com.opensource.jiangbiao.behavior.template;

public class Cat extends Template{

    @Override
     void weakUp() {
        System.out.println("I am cat weak up at the evening");
    }

    @Override
    void lunch() {
        System.out.println("I eat mouse");
    }

    @Override
    void sleep() {
        System.out.println("I sleep in the morning");
    }
}
