package com.opensource.jiangbiao.constract.filter;

import java.util.ArrayList;
import java.util.List;

public class GenderCriteria implements Criteria{


    String gender;
    public GenderCriteria(String gender){
        this.gender = gender;
    }

    @Override
    public List<Person> filter(List<Person> input) {
       List<Person> outPut = new ArrayList<>();
       for(Person temp:input){
           if(temp.getGender().equalsIgnoreCase(gender)){
               outPut.add(temp);
           }
       }
       return outPut;
    }


}
