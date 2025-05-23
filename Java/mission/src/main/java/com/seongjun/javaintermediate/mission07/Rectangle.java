package com.seongjun.javaintermediate.mission07;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String name;

    public Rectangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea(){
        return  width*height;
    }
    @Override
    public String getName() {
        return name;
    }

}
