package com.seongjun.javaintermediate.mission02;

import java.util.function.BiFunction;

public class Calculator {

    public double calculate(int num1, int num2, String operator) {
        BiFunction<Integer, Integer, Double> operation = null;

        switch (operator) {
            case "+":
                operation = (a, b) -> (double) a + b;
                break;
            case "-":
                operation = (a, b) -> (double) a - b;
                break;
            case "*":
                operation = (a, b) -> (double) a * b;
                break;
            case "/":
                operation = (a, b) -> {
                    if (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return Double.NaN;
                    }
                    return (double) a / b;
                };
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
        }

        if (operation != null) {
            return operation.apply(num1, num2);
        } else {
            return Double.NaN;
        }
    }
}