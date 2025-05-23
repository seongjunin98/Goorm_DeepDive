package com.seongjun.section02.assignment;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용. */
        /* 대입연산자와 산술 복합 대입 연산자
         * '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입
         * '+=' : 왼쪽의 피연산자에 오른족의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입
         * '-=' : 왼족의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피 연산자에 대입
         * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼족의 피연산자에 대입
         * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입
         * '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입
         */

        int num = 4;

        System.out.println("처음 수는 4이다. ");

        num = num + 2;

        System.out.println("그 수에 2를 더하면? " + num );

        num += 3 ;
        System.out.println("그리고 3을 더하면? " + num );

        num -= 5;
        System.out.println("그리고 5를 빼면? " + num );

        num *= 2;
        System.out.println("그리고 2를 곱하면? " + num );

        num /= 2;
        System.out.println("그리고 4를 나누면? " + num );

        num %= 2;
        System.out.println("그리고 2를 나눈 나머지는 " + num+"이다." );








    }
}
