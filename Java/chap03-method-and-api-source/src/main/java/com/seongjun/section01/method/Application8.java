package com.seongjun.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* 목표. static 메소드를 호출할 수 있다. */
        /* static 메소드 호출 */

        /* static 메소드를 호출하는 방법
         * 클래스명.메소드명(); <- 이런 방식으로 호출한다.
         */
        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10,20));

        /* 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다; */
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));
    }

    public static int sumTwoNumbers (int first, int second){

        return first + second;
    }
}
