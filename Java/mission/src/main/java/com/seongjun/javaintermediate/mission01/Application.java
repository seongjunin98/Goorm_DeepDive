package com.seongjun.javaintermediate.mission01;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    // 목표. 배열을 사용하여 간단한 정렬 알고리즘 구현하기
    // 정보. 사용자로부터 정수 배열을 입력받습니다. 버블 정렬, 선택 정렬 등의 간단한 정렬 알고리즘을 구현하여 배열을 정렬합니다. 정렬 전후의 배열 상태를 출력합니다.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 배열의 크기를 입력하세요 : ");
        int n = scanner.nextInt();

        if (n<=0) {
            System.out.println("배열의 크기는 음수가 될 수 없습니다.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println(n + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("정렬 전 배열 : " + Arrays.toString(arr));

        scanner.nextLine();

        System.out.println("정렬을 정해주세요 : 버블 / 선택 ");
        String choice = scanner.nextLine();

        if (choice.equals("버블")){
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(arr);
            System.out.println("버블 정렬 후 배열 : " + Arrays.toString(arr));
        } else if (choice.equals("선택")){
            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(arr);
            System.out.println("선택 정렬 후 배열 : " + Arrays.toString(arr));
        } else {
            System.out.println("버블과 선택 배열 중 입력해주세요.");
        }

        scanner.close();
    }

}
