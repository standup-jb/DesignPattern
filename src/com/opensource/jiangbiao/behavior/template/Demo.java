package com.opensource.jiangbiao.behavior.template;

public class Demo {

    public static void main(String[] args){
        Template cat =new Cat();
        Template pig =new Pig();
        cat.holdDay();

        System.out.println();
        pig.holdDay();
    }
}
