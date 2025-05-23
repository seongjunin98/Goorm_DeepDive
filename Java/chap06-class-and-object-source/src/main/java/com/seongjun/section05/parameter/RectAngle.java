package com.seongjun.section05.parameter;

public class RectAngle {

    /* 사각형의 길이와 높이를 저장하는 필드 */
    private double width;
    private double height;

    public RectAngle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    /* 필드에 접근하기 위한 설정자와 접근자 추가 */

    public void setWidth(double width) {this.width = width;
    }

    public void setHeight(double height) {this.height = height;
    }

    public double getWidth() {return width;
    }

    public double getHeight() {return height;
    }

    public  void calcArea(){

        double area = width*height;

        System.out.println("이 사각형의 넓이는 " + area + "입니다.");

    }

    public void calcRound(){

        double round = (width*height) *2;

        System.out.println("이 사각형의 둘레는 " + round + "입니다.");
    }


}
