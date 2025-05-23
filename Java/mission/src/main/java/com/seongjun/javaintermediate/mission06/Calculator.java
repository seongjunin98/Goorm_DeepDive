package com.seongjun.javaintermediate.mission06;

public class Calculator {

    public double calculate(int num1, int num2, String operator){
        double result = 0;

        switch (operator){
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                if (num2==0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = (double) num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자를 입력였습니다.");
        }

        return result;
    }
}
