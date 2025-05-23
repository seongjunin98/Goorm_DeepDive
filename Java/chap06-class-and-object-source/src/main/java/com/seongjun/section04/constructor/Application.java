package com.seongjun.section04.constructor;

import com.seongjun.section04.dto.UserDTO;

import java.util.Date;

public class Application {

    public static void main(String[] args){

    /* 목표. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다. */

    /* 목차. 1. 생성자를 이용한 초기화 */
    UserDTO user1 = new UserDTO("coco", "coco", "coco",new java.util.Date());
        System.out.println(user1.getInformation());

    /* 목차. 2. 기본 생성자와 설정자를 이용한 초기화 */
    UserDTO user2 = new UserDTO();
    user2.setId("cocomog");
    user2.setPwd("cocomog");
    user2.setName("cocomog");
    user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInformation());


    }

}
