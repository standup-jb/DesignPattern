package com.opensource.jiangbiao.create.builder;

public abstract class FoodBuilder {

    Food food=new Food();

    public abstract void buildGreens();

    public abstract void buildMeats();

    public abstract void buildFlavours();

    public Food getFood(){
        return food;
    }

}
