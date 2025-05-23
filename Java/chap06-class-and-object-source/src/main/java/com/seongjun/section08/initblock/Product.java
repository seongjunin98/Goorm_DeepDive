package com.seongjun.section08.initblock;

public class Product {

    /* 목차. 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
//    private String name;
//    private int price;
//    private static String brand;

    /* 목차. 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 100000;
    private static String brand = "삼성";

    /* 목차. 3. 인스턴스 초기화 블럭 */
    {
        name = "아이폰";
        price = 1200000;
        brand = "애플";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    static {
//
//    name = "옵티머스";
//    price = 800000;

    brand = "LG";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    /* 기본생성자 */
    public Product(){ System.out.println("기본 생성자 호출됨...");
    }

    /* 목차. 4. 매개변수 있는 생성자 */
    public Product(String name, int price, String brand) {
        this.price = price;
        this.name = name;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    /* 필드값 문자열 합치기 한 문자열 반환용 메소드 */
    public String getInformation(){

        return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
    }
}
