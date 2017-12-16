package com.opensource.jiangbiao.constract.filter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
       List<Person> persons = new ArrayList<>();
       persons.add(new Person("一一","男","中国"));
        persons.add(new Person("二二","女","中国"));
        persons.add(new Person("三三","女","美国"));
        persons.add(new Person("思思","男","中国"));
        persons.add(new Person("呜呜","女","日本"));
        persons.add(new Person("六六","女","中国"));
        persons.add(new Person("琪琪","男","澳大利亚"));
        persons.add(new Person("巴巴","男","美国"));

        Criteria male =new GenderCriteria("男");
        Criteria china =new NationCriteria("中国");
        Criteria chinamale = new AddCriteria(male,china);
        Criteria chinaOrMale = new OrCriteria(male,china);

        System.out.println("Male");
        print(male.filter(persons));
        System.out.println("China");
        print(china.filter(persons));
        System.out.println("ChinaMale");
        print(chinamale.filter(persons));
        System.out.println("ChinaOrMale");
        print(chinaOrMale.filter(persons));
    }


    public static void print(List<Person> input){
        for(Person person:input){
            System.out.println(person.toString());
        }
    }
}
