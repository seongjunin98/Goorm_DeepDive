package com.seongjun.section08.initblock;

public class Application {

    public static void main(String[] args){

    /* 목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */

    /* 인스턴스 생성 */
    Product product = new Product();

    /* 목차. 1. 자료형별 기본값으로 초기화 된 내용 확인 */
    System.out.println(product.getInformation());

    /* 목차. 2. 명시적 초기화로 필드 초기화 확인 */
    /* 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. */
    System.out.println(product.getInformation());

        /* 목차. 3. 초기화블럭으로 필드 초기화 확인 */
        /* 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. */
        System.out.println(product.getInformation());

        /* 목차. 4. 매개변수 있는 생성자를 이용한 초기화 확인 */
        Product product2 = new Product("블랙베리1", 500000, "블랙베리");
        System.out.println(product2.getInformation());

        /* 여기서 알 수 있는 초기화 순서는
         *  인스턴스변수 : 기본값 -> 명시적초기값 -> 인스턴스초기화블럭 -> 생성자
         *  클래스변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화블럭 -> 생성자
         * */

    }
}

