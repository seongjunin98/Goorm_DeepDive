package com.seongjun.javaintermediate.mission10;

public class Application {

    // 목표. 직사각형 클래스 작성하기
    // 정보. 직사각형의 길이와 너비를 저장하는 멤버 변수를 가진 직사각형 클래스를 작성합니다. 직사각형의 넓이와 둘레를 계산하는 메서드를 구현합니다. 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력합니다. 결과물로 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력하는 스크린샷을 제출합니다.

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(5, 10);

        //넓이
        double area = rectangle.calculateArea();
        System.out.println(rectangle.getDetails() + "의 넓이 : " + area );

        //둘레
        double perimeter = rectangle.calculateArea();
        System.out.println(rectangle.getDetails() + "의 둘레 : " + perimeter);

    }
}
