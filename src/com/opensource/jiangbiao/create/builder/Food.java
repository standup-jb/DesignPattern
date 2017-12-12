package com.opensource.jiangbiao.create.builder;

public class Food {

    //菜
    private String greens;

    //肉
    private String meat;

    //调料
    private String flavour;

    public String getGreens() {
        return greens;
    }

    public void setGreens(String greens) {
        this.greens = greens;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }


    public void print(){
        System.out.println("肉食："+getMeat()+" 配菜"+getGreens()+" 调料"+getFlavour());
    }
}
