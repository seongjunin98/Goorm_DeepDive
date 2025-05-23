package com.seongjun.section01.literal;

public class Applicaion1 {

    public static void main(String[] args) {

        /* 목표. 여러 가지 값의 형태를 출력할 수 있다. */

        /* 목차. 1. 숫자 형태의 갑사 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);
        /* 목차. 1-2 실수 형태의 값 출력 */
        System.out.println(1.23);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');
        // System.out.println('ab');                  //두 개 이상은 문자로 취급하지 않기 때문에 에러 발생.
        //  System.out.println('');                   //아무 문자도 기록되지 않은 경우도 에러 발생 .
        System.out.println('1');                    //숫자 값 이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단.

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");              //문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸야함.
        System.out.println("123");
        System.out.println("");
        System.out.println("a");                    //""안 값이 비거나, 숫자, 알파벳이여도 문자열로 취급.

        /* 목차 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);                  //true 혹은 fales 값을 논리형이라고 함.
    }
}
