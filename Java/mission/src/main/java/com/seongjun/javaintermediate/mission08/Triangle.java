package com.seongjun.javaintermediate.mission08;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("삼각형", 0);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void calculateArea(){
        this.area = 0.5 * base * height;
    }
}
