package com.opensource.jiangbiao.constract.decorator;

public class Demo {

    public static void main(String[] args){
        Hero blade = new BladeMaster("小剑","大剑");
        blade.hasSkill();

        Hero intensifyBlade =new IntensifyBlade(blade,"绝招");
        intensifyBlade.hasSkill();
    }
}
