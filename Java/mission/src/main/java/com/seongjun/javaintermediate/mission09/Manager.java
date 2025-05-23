package com.seongjun.javaintermediate.mission09;

public class Manager extends Employee {
    private String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public String getDetails(){
        return  super.getDetails() + ", 직책 : " + position;
    }

    public  void manageTeam(){
        System.out.println(name + " 관리자가 팀을 관리합니다.");
    }
}
