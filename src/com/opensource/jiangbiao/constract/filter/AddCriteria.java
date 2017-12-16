package com.opensource.jiangbiao.constract.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AddCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AddCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria =criteria;
        this.otherCriteria  = otherCriteria;
    }

    @Override
    public List<Person> filter(List<Person> input) {
        List<Person> criteriaOutput = criteria.filter(input);
        return otherCriteria.filter(criteriaOutput);
    }
}
