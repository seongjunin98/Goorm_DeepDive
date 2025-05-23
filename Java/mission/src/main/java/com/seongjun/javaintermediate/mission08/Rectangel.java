package com.seongjun.javaintermediate.mission08;


public class Rectangel extends Shape{
    private double width;
    private double height;

    public Rectangel(double width, double height) {
        super("사각형", 0);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void calculateArea(){
        this.area = width * height;
    }
}


