package com.opensource.jiangbiao.create.builder;

public class FoodBBuilder extends FoodBuilder{
    @Override
    public void buildGreens() {
        food.setGreens("西红柿");
    }

    @Override
    public void buildMeats() {
        food.setMeat("鸡肉");
    }

    @Override
    public void buildFlavours() {
        food.setFlavour("醋");
    }
}
