package com.seongjun.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine(){

        /* 목표. 중첩된 for 문의 흐름을 이해하고 적용할 수 있다.(1) */
        /* for문 안에서 for문을 이용할 수 있다. */
        /* 2단부터 단을 1씩 증가시키는 반복문 */
        for(int dan = 2; dan < 10; dan++){

            /* 단이 1개씩 증가하는 동안 수행할 내용은 해당 단의 구구단을 출력하는 것이다. */
            for(int su = 1; su <10; su++){

                System.out.println(dan + "*" + su + "=" + (dan*su));

            }

            /* 한 단이 출력되고 나면 한 줄을 띄운다. */
            System.out.println();

        }



    }

    public void printStarInputRowTimes(){

        /* 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 향에 "*"을 5개씩 출력하세요. */
        /* 키보드로 출력할 행을 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행을 입력해주세요 : ");
        int row = sc.nextInt();

        /* 입력한 행 만큼 반복 */
        for(int i = 1; i <=row; i++){

            for(int j = 1; j <=5; j++){

                System.out.print("*");

            }

            System.out.println();

        }

    }
}
