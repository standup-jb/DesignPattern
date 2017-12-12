package com.opensource.jiangbiao.create.builder;

public class FoodABuilder extends FoodBuilder{

    @Override
    public void buildGreens() {
        food.setGreens("土豆");
    }

    @Override
    public void buildMeats() {
        food.setMeat("猪肉");
    }

    @Override
    public void buildFlavours() {
        food.setFlavour("放辣椒");
    }
}
