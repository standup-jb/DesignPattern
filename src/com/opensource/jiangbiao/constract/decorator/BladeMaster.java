package com.opensource.jiangbiao.constract.decorator;

public class BladeMaster implements Hero {

    private String skillQ;
    private String skillW;

    public BladeMaster(String skillQ,String skillW){
        this.skillQ = skillQ;
        this.skillW = skillW;
    }


    @Override
    public void hasSkill() {
        System.out.print("我是剑圣 I have skill " + skillQ +","+skillW);
    }
}
