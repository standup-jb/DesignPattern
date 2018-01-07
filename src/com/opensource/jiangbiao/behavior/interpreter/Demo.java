package com.opensource.jiangbiao.behavior.interpreter;

public class Demo {

    public static Expression getMale(){
        Expression jiangbiao = new TerminalExpression("jiangbiao");
        Expression zhangshan = new TerminalExpression("zhangshan");
        return new OrExpression(jiangbiao,zhangshan);
    }

    public static Expression getMarriedWomen(){
        Expression wangmeimei = new TerminalExpression("wangmeimei");
        Expression married =new TerminalExpression("married");
        return new AndExpression(wangmeimei,married);
    }

    public static void main(String[] args){
        Expression male = getMale();
        System.out.println("jiangbiao is a male: "+male.interpret("jiangbiao"));
        Expression marriedFemale = getMarriedWomen();
        System.out.println("Wangmeimei is a married woman :"+getMarriedWomen().interpret("married wangmeimei"));
    }
}
