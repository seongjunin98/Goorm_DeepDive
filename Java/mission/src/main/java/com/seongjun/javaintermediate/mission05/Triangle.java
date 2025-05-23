package com.seongjun.javaintermediate.mission05;

public class Triangle extends AbstractShape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }
}
