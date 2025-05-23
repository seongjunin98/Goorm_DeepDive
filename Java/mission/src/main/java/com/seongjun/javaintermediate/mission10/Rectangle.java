package com.seongjun.javaintermediate.mission10;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public String getDetails(){
        return "직사각형 [길이 : ]" + length + ", 너비 : " + width + "]";
    }
}
