package com.opensource.jiangbiao.behavior.strategy;

public class Demo {

    public static void main(String[] args){
        int left = 5;
        int right = 10;
        Context context=new Context(new AddOperation());
        System.out.println("Use add operation left+right = "+context.execute(left,right));

        context = new Context(new SubstractOperation());
        System.out.println("Use substract operation left-right = "+context.execute(left,right));
    }
}
