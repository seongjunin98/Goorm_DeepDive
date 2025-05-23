package com.seongjun.javaintermediate.mission06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    // 목표. 예외 처리가 포함된 계산기 프로그램 작성하기
    // 정보. 사용자로부터 두 개의 숫자와 연산자를 입력받는 계산기 프로그램을 작성합니다. 사용자 입력 값이 잘못되었을 때 예외 처리를 구현하여 적절한 오류 메시지를 출력합니다.
    // 예외 처리가 동작하는 것을 확인할 수 있도록 프로그램을 실행하고 결과를 확인합니다. 결과물로 사용자 입력 값이 잘못되었을 때 예외 처리가 동작하는 스크린샷을 제출합니다.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("두 개의 정수를 입력하세요 : ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("연산자를 입력해주세요 : ");
            String operator = scanner.nextLine();

            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);

        } catch (InputMismatchException e){
            System.out.println("정수를 입력해 주세요.");
        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("프로그램 종료.");

        }
    }

