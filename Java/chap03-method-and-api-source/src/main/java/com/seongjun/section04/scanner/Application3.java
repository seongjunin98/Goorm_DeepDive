package com.seongjun.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public Application3(){

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요 : ");
        String str1 = sc.next();                //next는 nextLine과 다르게 공백이전 문자열만 출력
        System.out.println("str1  :" + str1);

        System.out.println("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1  :" + num1);

        System.out.println("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2  :" + num2);

        System.out.println("공백이 있는 문자열을 하나 입력해주세요 : ");
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("str2  :" + str2);

    }
}
