package com.seongjun.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public Application1() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");
        System.out.println("금액을 입력해주세요 : ");
        int money = sc.nextInt();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");

        System.out.println("키를 입력해 주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        System.out.println("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 : " + number + "입니다.");

        System.out.println("참과 거짓 중에 한 가지를 true of false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        sc.nextLine();
        System.out.println("아무 문자나 입력해 주세여 : ");
        char ch = sc.next().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
