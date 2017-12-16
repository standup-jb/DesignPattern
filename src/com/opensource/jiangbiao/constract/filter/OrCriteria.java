package com.opensource.jiangbiao.constract.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> filter(List<Person> input) {
        List<Person> criteriaOutput = criteria.filter(input);
        List<Person> otherCriteriaOutput = criteria.filter(input);
        HashSet<Person> set =new HashSet<>();
        set.addAll(criteriaOutput);
        set.addAll(otherCriteriaOutput);
        return new ArrayList<>(set);

    }
}
