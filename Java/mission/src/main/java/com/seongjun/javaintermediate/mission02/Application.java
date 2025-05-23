package com.seongjun.javaintermediate.mission02;

import java.util.Scanner;

public class Application {

    // 목표. 람다 표현식을 활용한 간단한 계산기 프로그램 작성하기
    // 정보. 사용자로부터 두 개의 숫자와 연산자를 입력받습니다. 람다 표현식을 사용하여 입력받은 숫자와 연산자에 따른 계산 기능을 구현합니다. 계산 결과를 출력합니다. 결과물로 사용자 입력을 받아 람다 표현식으로 구현된 계산 기능을 수행하는 스크린샷을 제출합니다.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("정수 두 개를 입력하세요 : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("연산자를 입력해 주세요 : ");
        String operator = scanner.nextLine();

        double result = calculator.calculate(num1, num2, operator);

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result );



        scanner.close();

    }

}

