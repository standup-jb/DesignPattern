package com.opensource.jiangbiao.constract.filter;

import java.util.ArrayList;
import java.util.List;

public class NationCriteria implements Criteria{

    private String nationality;
    public NationCriteria(String nationality){
        this.nationality = nationality;
    }

    @Override
    public List<Person> filter(List<Person> input) {
        List<Person> output =new ArrayList<>();
        for(Person person:input){
            if (person.getNationality().equalsIgnoreCase(nationality)){
                output.add(person);
            }
        }
        return output;
    }
}
