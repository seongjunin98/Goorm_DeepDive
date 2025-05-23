package com.seongjun.javabeginner2;

public class Mission3 {

    /* 목표. 두 개의 정수를 더하고 빼는 메서드 작성하기 */

    // 두 정수를 더하는 메서드
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 두 정수를 빼는 메서드
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // 더하기 결과
        int sum = add(num1, num2);
        System.out.println("두 수의 합 = " + sum);

        // 빼기 결과
        int difference = subtract(num1, num2);
        System.out.println("두 수의 차 = " + difference);
    }
}

