package com.seongjun.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;		//필드로 다른 클래스 자료형도 사용할 수 있다. (ex. String)

    /* 목차. 1. 기본생성자(default constructor) */
    public User (){

        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    /* 목차. 2. 매개변수 있는 생성자 */
    /* 초기화할 필드가 여러개 인 경우, 초기화하고 싶은 필드의 갯수별로 생성자를 여러개 준비해둘 수 있다. */
    /* id, pwd, name의 초기화를 담당할 생성자 */

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }


    /* 목차. 3. id, pwd, name, enrollDate의 초기화를 담당할 생성자(모든 필드를 초기화 하는 생성자) */

    /* 목차. 3-1. 각 필드에 접근하여 초기화 */
//    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

    /* 목차. 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화 */
    public User(String id, String pwd, String name,java.util.Date enrollDate) {

    this(id, pwd, name);                    //미리 작성한 세 개의 필드를 초기화 하는 생성자로 매개변수로 받은 값을 전달
    this.enrollDate = enrollDate;           //나머지 필드 초기화

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");

    }
    public String getInformation() {

        return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}
