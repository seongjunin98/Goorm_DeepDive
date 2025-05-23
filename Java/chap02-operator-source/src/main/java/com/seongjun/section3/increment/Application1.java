package com.seongjun.section3.increment;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 증감연산자에 대해 이해하고 활용 */
        /* 증감연산자
         * 피연산자의 앞 or 뒤에 사용이 가능하다.
         * '++' : 1 증가의 의미
         * '--' : 1 감소의 의미
         */

        /* 증간연산자를 단항으로만 사용 */
        /* 단항으로 사용될 때는 1증가/1 감소의 의미를 가진다. */

        int num = 10;

        num++;
        System.out.println("num++ = " + num);

        ++num;
        System.out.println("++num = " + num);

        num--;
        System.out.println("num-- = " + num);

        --num;
        System.out.println("num-- = " + num);

        /* 증감연산자를 다른 연산자와 함께 사용 */
        /* 주의사항.
         * 증감연산자를 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
         * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
         * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
         * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피 연산자의 값을 1 증가시킴
         * '--var' : 피연산자의 값을 먼저 1 감소 시킨 . 다른 연산을 진행
         * 'var--' : 다른 연산을 먼저 진행하고 . 뒤 마지막에 피연산자의 값을 1 감소시킴
         */

        int firstNum1 = 10;
        int result = firstNum1++ * 3;

        System.out.println("result = " + result);  /* 예상 값 30 */
        System.out.println("firstNum1 = " + firstNum1);

        int firstNum2 = 10;
        int result2 = ++firstNum2 * 3;

        System.out.println("result2 = " + result2);
        System.out.println("firstNum2 = " + firstNum2);

        int firstNum3 = 10;
        int result3 = firstNum3-- * 3;

        System.out.println("result3 = " + result3);
        System.out.println("firstNum3 = " + firstNum3);

        int firstNum4 = 10;
        int result4 = --firstNum4 * 3;

        System.out.println("result4 = " + result4);
        System.out.println("firstNum4 = " + firstNum4);


    }
}
