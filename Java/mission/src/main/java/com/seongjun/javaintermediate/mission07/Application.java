package com.seongjun.javaintermediate.mission07;

public class Application {

    // 목표. 도형 인터페이스 작성하기
    // 정보. 도형 인터페이스를 작성하고, 도형의 면적을 계산하는 메서드를 선언합니다. 도형 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다. 도형 인터페이스를 구현한 클래스의 객체를 생성하고, 면적을 계산하여 출력합니다. 결과물로 도형 인터페이스를 구현한 클래스를 생성하고, 면적을 계산하여 출력하는 스크린샷을 제출합니다.

    public static void main(String[] args){
        Circle circle = new Circle(6.0, "원");
        Rectangle rectangle = new Rectangle(10, 8,"사각형");
        Triangle triangle = new Triangle(4, 7, "삼각형");

        System.out.println(circle.getName() + "의 면적 : " + circle.calculateArea());
        System.out.println(rectangle.getName() + "의 면적 : " + rectangle.calculateArea());
        System.out.println(triangle.getName() + "의 면적 : " + triangle.calculateArea());

        Shape Circle1 = new Circle(1,"또 다른 원");
        Shape Rectangle1 = new Rectangle(2, 5, "또 다른 사각형");
        Shape Triangle1 = new Triangle(8, 2, "또 다른 삼각형");

        System.out.println(Circle1.getName() + "의 면적" + Circle1.calculateArea());
        System.out.println(Rectangle1.getName() + "의 면적" + Rectangle1.calculateArea());
        System.out.println(Triangle1.getName() + "의 면적" + Triangle1.calculateArea());
    }
}
