package com.seongjun.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public Application2() {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println(greeting1);

        System.out.println("인사말을 입력해주세요 : ");
        String greeting2 = sc.nextLine();
        System.out.println(greeting2);


    }
}
