package com.seongjun.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        /* 목표. contonue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* continue문은 반복문 내에서 사용한다.
         * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
         * 일반적으로 if(조건식) { continue; } 처럼 사용된다.
         * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
         */

        /* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력 */
        for(int i = 1; i<=100;i++){

            if(i%4==0 && i%5==0){

                /* i값이 4와 5의 공배수 인 경우 i값 출력 */
                System.out.println(i);
            }else {

                /* 공배수가 아닌 경우 증감식으로 넘어감 */
                continue;
            }

        }

    }
}
