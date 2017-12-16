package com.opensource.jiangbiao.constract.decorator;

public class IntensifyBlade implements Hero{


    private Hero hero;
    private String skillE;
    public IntensifyBlade(Hero hero,String skillE){
        this.hero = hero;
        this.skillE = skillE;
    }

    @Override
    public void hasSkill() {
        System.out.println();
        System.out.print("我是加强版剑圣 ");
        this.hero.hasSkill();
        System.out.println(", "+skillE);
    }
}
