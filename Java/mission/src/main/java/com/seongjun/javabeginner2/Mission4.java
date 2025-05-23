package com.seongjun.javabeginner2;

import java.util.Arrays;

public class Mission4 {

    public static void main(String[] args){

        /* 목표. 5개의 정수 오름차순 정렬하기 */

        int[] iarray = {1,5,3,9,7,0};

        Arrays.sort(iarray);



        System.out.println("5개의 정수 오름차순 정렬하기");

        for(int number2 : iarray) {
            System.out.println(number2);
        }
    }
}
