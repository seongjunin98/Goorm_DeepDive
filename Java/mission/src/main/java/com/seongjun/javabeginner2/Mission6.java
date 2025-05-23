package com.seongjun.javabeginner2;

import java.util.Scanner;

public class Mission6 {

    public static void main(String[] args) {

        /* 목표. 홀수/짝수 판별 프로그램 작성하기 */

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        switch (num % 2){

            case 0 :
                if (num==0){
                    System.out.println(num + "은 0 입니다.");
                }else {
                    System.out.println(num + " : 은 짝수입니다.");
                }
                break;
            case 1 :
                System.out.println(num + " : 은 홀수입니다.");
                break;
            default:
                System.out.println("정수를 입력해주세요.");

        }

        sc.close();




    }
}
