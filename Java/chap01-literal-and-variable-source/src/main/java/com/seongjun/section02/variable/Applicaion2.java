package com.seongjun.section02.variable;

public class Applicaion2 {

    public static void main(String[] args) {

        /* 목표. 변수를 선언하고 갑승ㄹ 할당하여 사용 */
        /* 변수 사용 방법
         *  1. 변수를 준비한다.(선언)
         *  2. 변에 값을 대입한다. (값 대입 및 초기화-여기서 초기화는 처음 넣는 값을 의미함)
         *  3. 변수를 사용한다.
         */

        /* 목차. 1. 변수 준비(선언) */
        /* 기본자료형 8가지를 살펴보자. */

        /* 목차. 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum;			//1byte
        short snum;			//2byte
        int inum;			//4byte     //정수를 취급하는 자료형 변수의 메인
        long lnum;			//8byte     //변수로 사용시 뒤에 대문자 'L'을 붙여야한다.

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum;			//4byte     //변수로 사용시 소문자 'f'를 사용
        double dnum;		//8byte     //실수를 취급하는 자료형 변수의 메인

        /* 목차. 1-1-2. 문자를 취급하는 자료형 */
        /* 문자를 취급하는 자료형은 한 가지가 있다. */
        char ch;			//2byte     //문자 형태의 값을 저장할 수 있다.
        char ch2;                       //ch = 'a', 'a'는 97이라는 숫자 그래서 숫로도 저장 가능

        /* 목차. 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue;		//1byte     //한 개의 변수 지정 가능

        /* 이상 8가지를 기본자료형(Primary type)이라고 한다. (문자열은 나중에 깊게 다룬다.)*/

        /* 목차. 1-1-4. 문자열을 취급하는 자료형 */
        String str;			//4byte (엄밀히 이야기 하면 주소값은 4byte 정수형이다.)

        /* 변수를 이용해서 연산하기 */
        /* 변수에 저장된 값을 이용해서 연산을 할 수도 있다. */

        int point = 1000;
        int bonus = 100;
        str = "포인트와 보너스의 합산은 다음과 같습니다. ";
        System.out.println(str + (point + bonus));

        str = "획득하신 포인트와 기존 포인트의 합산입니다. ";
        point = 200 + point;
        System.out.println(str + point);
    }
}
