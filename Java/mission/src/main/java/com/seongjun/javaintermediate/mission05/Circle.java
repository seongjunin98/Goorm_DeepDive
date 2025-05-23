package com.seongjun.javaintermediate.mission05;

public class Circle extends AbstractShape {
    private double radius;

    public  Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double calculateArea(){

        return Math.PI*radius*radius;
    }
}
