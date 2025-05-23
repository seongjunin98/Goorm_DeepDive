package com.seongjun.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다. */
        /* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         * 지금까지 우리가 배운 변수는 지역변수에 해당한다.
         */

        /* 변수의 종류
         * 1. 지역변수
         * 2. 매개변수
         * 3. 전역변수(필드)
         * 4. 클래스(static)변수
         */

        /* 지역변수는 선언한 메소드 블럭 내우에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         * 이 때 전달하는 값을 전달인자(argument)라고 부르고,
         * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         */

        Application3 app3 = new Application3();

        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        /* 1. 전달인자로 값 전달 테스트 */
        app3.testMethod(40);

        /* 2. 변수에 저장한 값 전달 테스트 */
        /* 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
        int age = 20;
        app3.testMethod(age);

        /* 2-2. 자동현변환을 이용하여 값 전달을 할 수 있다. */
        byte byteAng = 10;
        app3.testMethod(byteAng);

        /* 2-3. 강제형변환을 이용해 값 전달을 할 수 있다.*/
        long longAng = 80;
        //app3.testMethod(longAng);         //자동 형변환을 할 수 없어서 에러 발생
        app3.testMethod((int)longAng);      //강제 형변환을 이용하여 자료형을 맞춘 후 호출할 수 있다.(데이터 손실 주의)

        /* 2-4. 연산 결과를 이용해서 값 전달을 할 수 있다. */
        app3.testMethod(age*3);

    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }
}
