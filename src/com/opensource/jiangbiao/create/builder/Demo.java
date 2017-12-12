package com.opensource.jiangbiao.create.builder;

public class Demo {

    public static void main(String[] args){
        //创建厨师
        Chef chef=new Chef();
        //创建菜谱
        FoodABuilder foodABuilder = new FoodABuilder();

        //把菜谱交给厨师
        chef.setFoodBuilder(foodABuilder);

        //厨师炒菜给客户
        Food food = chef.fry();

        food.print();

    }
}
