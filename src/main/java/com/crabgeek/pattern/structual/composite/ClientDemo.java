package com.crabgeek.pattern.structual.composite;

public class ClientDemo {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("张三", "CEO", 100000);
        ConcreteCompany developDep = new ConcreteCompany("李四", "研发部经理", 12000);
        ConcreteCompany salesDep = new ConcreteCompany("王五", "销售部经理", 15000);
        ConcreteCompany financeDep = new ConcreteCompany("马六", "财务部经理", 10000);

        Employee e1 = new Employee("A", "研发部", 3000);
        Employee e2 = new Employee("B", "研发部", 2000);
        Employee e3 = new Employee("C", "研发部", 1000);
        Employee e4 = new Employee("D", "研发部", 6000);
        Employee e5 = new Employee("E", "销售部", 7000);
        Employee e6 = new Employee("F", "销售部", 4000);
        Employee e7 = new Employee("G", "销售部", 6000);
        Employee e8 = new Employee("H", "财务部", 8000);
        Employee e9 = new Employee("I", "财务部", 2000);

        root.add(developDep);
        root.add(salesDep);
        root.add(financeDep);

        developDep.add(e1);
        developDep.add(e2);
        developDep.add(e3);
        developDep.add(e4);

        salesDep.add(e5);
        salesDep.add(e6);
        salesDep.add(e7);

        financeDep.add(e8);
        financeDep.add(e9);

        System.out.println(root.getInfo());

        display(root);
    }

    public static void display(ConcreteCompany root) {
        for (Company c : root.getChild()) {
            if (c instanceof Employee) {
                System.out.println(c.getInfo());
            } else {
                System.out.println("\n" + c.getInfo());
                display((ConcreteCompany) c);
            }
        }
    }
}
