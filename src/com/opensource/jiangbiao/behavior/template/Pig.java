package com.opensource.jiangbiao.behavior.template;

public class Pig extends Template{

    @Override
    void weakUp() {
        System.out.println("I am Pig,I weak up in the morning");
    }

    @Override
    void lunch() {
        System.out.println("I can eat everything in the afternoon");
    }

    @Override
    void sleep() {
        System.out.println("I sleep after lunch");
    }
}
