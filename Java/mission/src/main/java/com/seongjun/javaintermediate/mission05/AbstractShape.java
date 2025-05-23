package com.seongjun.javaintermediate.mission05;

public abstract class AbstractShape implements Shape {

    protected String name;

    public AbstractShape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract double calculateArea();
}
