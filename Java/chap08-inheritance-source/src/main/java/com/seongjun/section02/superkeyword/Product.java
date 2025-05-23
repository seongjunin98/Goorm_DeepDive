package com.seongjun.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    /* 기본생성자 */
    public Product() { System.out.println("Product 클래스의 기본생성자 호출함..."); }

    /* 모든 필드를 초기화하는 생성자 */

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {

        /*  아무 클래스도 상속받지 않았는데 super()가 호출된다.
         *  java.lang.Object 클래스의 생성자를 호출하는 것이다.
         *  모든 클래스는 Object 클래스의 후손이기 때문이다.
         * */

        super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");
    }

    /* setter/getter */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    /* 모든 필드 값을 문자열로 반환하는 메소드 */
    public String getInformation() {
        return "Product [code=" + code + ", brand=" + brand + ", name" + name + ", price=," + price +
                ", manufacturingDate=" + manufacturingDate + "]";
    }
}






