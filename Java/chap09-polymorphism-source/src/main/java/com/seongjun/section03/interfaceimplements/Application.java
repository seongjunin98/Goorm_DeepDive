package com.seongjun.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /* 목표. 인터페이스(interface)에 대해 이해할 수 있다. */
        //		InterProduct interProduct = new InterProduct();		//에러남

        InterProduct interProduct = new Product();

        /* 인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출됨 */
        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        /* 오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출됨 */
        interProduct.defaultMethod();

        /* static 메소드는 인터페이스명.메소드명(); 으로 호출함 */
        InterProduct.staticMethod();

        /* 상수 필드 접근도 인터페이스명.필드명 으로 접근함 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

    }
}


