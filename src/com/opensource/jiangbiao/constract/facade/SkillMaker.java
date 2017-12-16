package com.opensource.jiangbiao.constract.facade;

public class SkillMaker {

    private SkillQ skillQ;
    private SkillW skillW;

    public SkillMaker(){
        this.skillQ = new SkillQ();
        this.skillW = new SkillW();
    }


    public SkillQ getSkillQ() {
        return skillQ;
    }

    public void setSkillQ(SkillQ skillQ) {
        this.skillQ = skillQ;
    }

    public SkillW getSkillW() {
        return skillW;
    }

    public void setSkillW(SkillW skillW) {
        this.skillW = skillW;
    }


    public void castingQ(){
        skillQ.casting();
    }

    public void castingW(){
        skillW.casting();
    }
}
