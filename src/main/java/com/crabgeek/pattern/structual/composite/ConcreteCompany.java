package com.crabgeek.pattern.structual.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany implements Company{
    private List<Company> companyList = new ArrayList<>();
    private String name;
    private String position;
    private int salary;

    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        this.companyList.add(company);
    }

    public void remove(Company company) {
        this.companyList.remove(company);
    }

    public List<Company> getChild() {
        return this.companyList;
    }

    @Override
    public String getInfo() {
        String info = "名称: " + this.name +
                "\t职位: " + this.position +
                "\t薪水: " + this.salary;
        return info;
    }
}
