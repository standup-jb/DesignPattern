package com.opensource.jiangbiao.create.builder;

public class Chef {

    private FoodBuilder foodBuilder;

    public void setFoodBuilder(FoodBuilder foodBuilder){
        this.foodBuilder = foodBuilder;
    }

    //根据foodBuilder创建食物
    public Food fry(){
        foodBuilder.buildFlavours();
        foodBuilder.buildGreens();
        foodBuilder.buildMeats();
        return foodBuilder.getFood();
    }

}
