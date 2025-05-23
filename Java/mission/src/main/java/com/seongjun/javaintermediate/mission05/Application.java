package com.seongjun.javaintermediate.mission05;

public class Application {

    // 목표. 추상 클래스와 인터페이스를 활용한 도형 프로그램 작성하기
    // 정보. 도형 추상 클래스를 작성하고, 면적을 계산하는 추상 메서드를 선언합니다. 도형 인터페이스를 작성하고, 면적을 계산하는 메서드를 선언합니다. 추상 클래스와 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다.
    // 다양한 도형 객체를 생성하고, 각 도형의 면적을 계산하여 출력합니다. 결과물로 추상 클래스와 인터페이스를 이용하여 다양한 도형 객체를 생성하고 면적을 계산하여 출력하는 스크린샷을 제출합니다.

    public static void main(String[] args){

        Circle circle = new Circle("원", 5);
        Rectangle rectangle = new Rectangle("사각형", 4,5);
        Triangle triangle = new Triangle("삼각형", 6, 7);

        System.out.println(circle.getName() + "의 면적: " + circle.calculateArea());
        System.out.println(rectangle.getName() + "의 면적: " + rectangle.calculateArea());
        System.out.println(triangle.getName() + "의 면적: " + triangle.calculateArea());

        Shape anotherCircle = new Circle("또 다른 원", 3.0);
        Shape anotherRectangle = new Rectangle("또 다른 사각형", 2.0, 5.0);
        Shape anotherTriangle = new Triangle("또 다른 삼각형", 4.0, 7.0);


        System.out.println(anotherCircle.getName() + "의 면적 (인터페이스): " + anotherCircle.calculateArea());
        System.out.println(anotherRectangle.getName() + "의 면적 (인터페이스): " + anotherRectangle.calculateArea());
        System.out.println(anotherTriangle.getName() + "의 면적 (인터페이스): " + anotherTriangle.calculateArea());
    }
}
