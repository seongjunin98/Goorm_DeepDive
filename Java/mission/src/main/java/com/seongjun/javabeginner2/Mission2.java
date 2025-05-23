package com.seongjun.javabeginner2;

import java.util.Scanner;

public class Mission2 {

    public static void main(String[] args){

        /* 목표. 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기 */

        Scanner sc = new Scanner(System.in);

        System.out.println("직사각형의 가로 길이를 입력하세요 : ");
        double width = sc.nextDouble();
        System.out.println("직사각형의 세로 길이를 입력하세요 : ");
        double hight = sc.nextDouble();

        double area = width*hight;

        System.out.println("직사각형 넓이 : " + area);

        sc.close();




    }
}
