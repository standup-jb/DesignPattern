package com.opensource.jiangbiao.constract.composite;

public class Demo {

    public static void main(String[] args){
        CCP ccp=new CCPBranch("中国共产党");
        CCP chongqing = new CCPBranch("重庆市委");
        CCP sichuan = new CCPBranch("四川省委");
        CCP chengdu =new CCPBranch("成都市委");
        ccp.add(chongqing);
        ccp.add(sichuan);
        sichuan.add(chengdu);
        ccp.display(0);

    }

}
