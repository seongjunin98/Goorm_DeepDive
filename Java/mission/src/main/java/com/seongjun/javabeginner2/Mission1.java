package com.seongjun.javabeginner2;

public class Mission1 {


    public static void main(String[] args) {

    /* 목표. 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기. */

        int[] numArray = new int[5];

        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;
        numArray[3] = 40;
        numArray[4] = 50;

        for (int i = 0; i < numArray.length; i++) {

            System.out.println("numarray[" + i + "] : " + numArray[i]);
        }

        System.out.println();

        /* 배열 평균 구하기 */
        int sum = 0;
        for (int num : numArray) {
            sum += num;

        }

        System.out.println("배열의 합 : " + sum);

        int average = sum / numArray.length;

        System.out.println("배열의 평균 : " + average);

        System.out.println();

        /* 배열 요소 변경 */
        numArray[2] = 60;

        for (int i = 0; i < numArray.length; i++) {

            System.out.println("numarray[" + i + "] : " + numArray[i]);


        }
    }
}
