package com.seongjun.javaintermediate.mission07;

public class Triangle implements Shape {
    private double base;
    private double height;
    private String name;

    public Triangle(double base, double height, String name) {
        this.base = base;
        this.height = height;
        this.name = name;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }

}
