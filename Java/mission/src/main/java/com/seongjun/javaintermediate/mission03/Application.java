package com.seongjun.javaintermediate.mission03;

import java.util.Scanner;

public class Application {

    // 목적. 문자열 뒤집기 및 대소문자 변환 프로그램 작성하기
    // 정보.사용자로부터 문자열을 입력받습니다. 입력받은 문자열을 뒤집어 출력합니다. 입력받은 문자열의 대소문자를 변환하여 출력합니다. 결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요 : ");
        String inputString = scanner.nextLine();

        String reversdeString = new StringBuilder(inputString).reverse().toString();
        System.out.println("문자열 뒤집기 : " + reversdeString);

        StringBuilder caseChangedString = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                caseChangedString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                caseChangedString.append(Character.toUpperCase(c));
            } else {
                caseChangedString.append(c); // 알파벳이 아닌 문자는 그대로 유지
            }
        }
        System.out.println("대소문자 변환된 문자열: " + caseChangedString.toString());

        scanner.close();
    }
}
