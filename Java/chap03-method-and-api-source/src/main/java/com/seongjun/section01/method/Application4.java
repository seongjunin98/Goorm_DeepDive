package com.seongjun.section01.method;

public class Application4 {

    public static void main(String[] args) {

        /* 목표. 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다. */
        /* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */

        /* 1. 여러 겨의 매ㅐ변수를 가진 메소드 호출 */
        Application4 app4 = new Application4();
        app4.testMethod("홍길동",20,'남');
//        app4.testMethod(20, "유관순",'여');                   //값의 갯수는 맛지만 순서가 다르게 전달되면 호출하지 못한다.

        /* 2. 변수에 저장된 값을 전달하며 호출할 수 있다. */
        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name,age,gender);


    }

    public void testMethod(String name, int age,char gender){

        /* 매개변수도 일종의 지역변수로 분류된다.
         * 매개변수 역시 final 키워드를 사용할 수 있다.
         * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.
         */

        System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender);
    }
}
