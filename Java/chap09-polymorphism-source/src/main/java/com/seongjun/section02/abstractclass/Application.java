package com.seongjun.section02.abstractclass;

public class Application {

    public static void main(String[] args) {

    /* 목표. 추상클래스와 추상메소드에 대해 이해할 수 있다. */

    /* Product 클래스로 인스턴스를 생성할 수 없다. */
//		Product product = new Product();	//추상클래스는 인스턴스 생성 불가

    /* 추상클래스를 상속받은 객체를 이용해야 한다. */

    SmartPhone smartPhone = new SmartPhone();

   /* SmartPhone은 SmartPhone 타입이기도 하지만 Product 타입이기도 하다. */
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 따라서 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용할 수 있다. */
        Product product = new SmartPhone();

        /* 동적 바인딩에 의해 SmartPhone의 메소드가 호출된다. */
        product.abstMethod();

        /* 추상클래스가 가진 메소드도 호출할 수 있다. */
        product.nonStaticMethod();

        /* static 메소드는 그냥 사용이 가능하다. (인스턴스 생성 불필요) */
        Product.staticMethod();
    }
}
