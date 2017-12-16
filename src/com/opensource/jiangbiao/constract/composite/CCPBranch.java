package com.opensource.jiangbiao.constract.composite;



import java.util.ArrayList;
import java.util.List;

public class CCPBranch extends CCP {

    List<CCP> branches= new ArrayList<>();

    public CCPBranch(String name){
        super(name);
    }

    @Override

    protected void add(CCP ccp) {
        branches.add(ccp);
    }

    @Override
    protected void remove(CCP ccp) {
        branches.remove(ccp);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<depth;i++){
            sb.append("-");
        }
        System.out.println(sb.toString()+this.getName());
        for(CCP ccp:branches){
            ccp.display(depth+1);
        }
    }
}
