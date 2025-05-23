package com.seongjun.section01.arithmetic;

public class Applicaton1 {

    public static void main(String[] args) {

        /* 목표. 산술연산자에 대해 이해하고 활용 */
        /* 산술 연산자
         * 산술 연잔사는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 이용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
         * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
         */

        /* 산술연산자의 종류
         * '+' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함
         * '-' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺌
         * '*' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱함
         * '/' : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눔
         * '%' : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 나머지를 반환
         * */

        /* 우선순위
         * 수학의 개념과 유사, 곱하기와 나누기가 더하기와 빼기 보다 우선시
         * 우선순위가 같은 경우 연산자의 결합 방향에 의해 실행 순서 결정
         */

        double num1 = 15;
        double num2 = 5;

        System.out.println(num1 + " 더하기 " + num2 + " = "  + (num1 + num2));
        System.out.println(num1 + " 빼기 " + num2 + " = "  + (num1 - num2));
        System.out.println(num1 + " 곱하기 " + num2 + " = "  + (num1 * num2));
        System.out.println(num1 + " 나누기 " + num2 + " = "  + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = "  + (num1 % num2));

    }
}
