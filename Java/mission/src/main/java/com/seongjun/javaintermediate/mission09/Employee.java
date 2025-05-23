package com.seongjun.javaintermediate.mission09;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDetails(){
        return "이름 : " + name + ", 급여 : " + salary;
    }
}
