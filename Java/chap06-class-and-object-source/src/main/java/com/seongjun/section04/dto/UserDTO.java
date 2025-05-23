package com.seongjun.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO() {}


    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 설정자(setter) */

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    /* 접근자(getter) */

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    /* 접근자로 하나씩 필드값을 확인해보기 번거롭기 때문에
     *  모든 필드의 값을 하나의 문자열로 반환하는 메소드를 필드값 확인용으로 많이 사용한다.
     * */

    public String getInformation(){
        return "User DTO [id=" + this.id + ", pwd" + this.pwd + ", name" + this.name + ", enrollDate" + this.enrollDate + "]";
    }
}


