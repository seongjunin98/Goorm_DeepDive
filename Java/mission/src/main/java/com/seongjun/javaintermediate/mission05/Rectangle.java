package com.seongjun.javaintermediate.mission05;

public class Rectangle extends AbstractShape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeigth(){
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
