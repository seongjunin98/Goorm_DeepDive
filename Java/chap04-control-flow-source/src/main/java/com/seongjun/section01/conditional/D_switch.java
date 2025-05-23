package com.seongjun.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement(){

        /* 목표. switch문 단독 사용에 대한 흐름을 이해가 적용할 수 있다. */

        /* 정수 두 개와 연산 기호 문자를 입력 받아서
         * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연간 결과가 달라짐 */
        switch(op){

            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;                    //second가 0이면 에러 발생
                break;

            case  '%':
                result = first % second;
                break;

            /* default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 작성해주는 것이 좋다. */
            /* 산술연산 이외 다른 문자에 대한 처리는 생략하였음 */

        }

        System.out.println(first + " " + op + " " + second + " " + " = " + result);

    }

    public void testSwitchVendingMachine(){

        /* 목표. switch문 내의 break문에 대해 흐름을 이해하고 적용할 수 있다. */
        /* swithch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
         * break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
         */

        /* 간단한 자판기 */
        System.out.println("====== groom vending machine ======");
        System.out.println(" apple  banana  orange melon grape");
        System.out.println("===================================");
        System.out.println("과일을 선택해주세요");

        //원하는 과일을 입력 받는다.

        Scanner sc = new Scanner(System.in);

        String selecteFruit = sc.nextLine();

        int price = 0;

        String order = "";

        switch (selecteFruit){

            case "apple" :
                order = "apple";
                price = 1000;
                break;


            case "banana" :
                order = "banana";
                price = 1500;
                break;

            case "orange" :
                order = "orange";
                price = 2000;
                break;

            case "melon" :
                order = "melon";
                price = 2500;
                break;

            case "grape" :
                order = "grape";
                price = 3000;
                break;
        }

        System.out.println("주문하신 과일은 :  " + order);
        System.out.println("투입하실 금액은 :  " + price);

    }
}
