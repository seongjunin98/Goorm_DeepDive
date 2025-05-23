package com.seongjun.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {

        /* 목표. if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [if문 표현식]
         *  if(조건식) {
         *      조건식이 true일 때 실행할 명령문;
         * }
         */

        /* 조건식 : true or false가 나는 연산식을 조건식이라고 한다.
         * 조건식의 결과 값이 거짓(false)이면 안에 잇는 코드를 무시하고 넘어감
         */

        /* 조건을 만족하는 경우에만 추가적인 명령을 실행시키고자 할 때 주로 사용한다. */

        /* 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
         * 짝수가 아니면 출력하지 않은 구문을 작성해보자
         * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 하나를 입력해 주세요 : ");
        int num = sc.nextInt();


        /* 양수가 맞는 경우 다시 한 번 더 짝수인지 조건을 확인함 */
        if(num % 2 == 0){

            System.out.println("입력하신 숫자는 짝수입니다.");
        }



        /* 조건문과 상관 없이 프로그램 종료를 확인하기 위한 용도의 출력 구문 */
        System.out.println("프로그램을 종료합니다.");

    }

    public void testNestedIfStatement() {

        /* 목표. 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if문 실행 흐름 확인 */
        /* if문 안에서 또 다른 조건을 사용하여 if문 사용할 수 있다. */

        /* 정수 한 개를 입력 받아 그 수 가 양수인 경우에만 짝수인지 확인하여
         * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
         * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않은 구문을 작성해보자
         * 단, 초건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if (num>0){

            /* 양수가 맞는 경우 다시 한 번 더 짝수인지 조건을 확인해야함 */
            if(num%2==0){

                /* 짝수가 맞는 경우*/
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");

            }


            /* 조건문과 상관 없이 프래그램 종료를 확인하기 위한 용도의 출력 구문 */
            System.out.println("프로그램을 종료합니다.");

        }

    }
}
