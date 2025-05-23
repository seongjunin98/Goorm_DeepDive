package com.seongjun.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /* 목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문 */
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

        }

    }

    public void testForExample1() {

        /* 목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (1) */

        Scanner sc = new Scanner(System.in);

        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");

        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /* 반복해야 하는 내용은
         * 1. 안내문구 출력
         * 2. 학생 이름 입력 받아 변수에 저장
         * 3. 저장된 이름을 출력
         *
         * 반복 횟수는 1부터 10까지 1식 증가하며 총 10번을 반복한다.
         */

        /* 반복문으로 개선 */
        for (int i = 1; i <= 10; i++){

            System.out.println(i + "번째 학생의 이름을 입력해 주세요.");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");


        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");
    }


    public void testForExample2() {

        /* 목표 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (2) */

        /*1 ~ 10까지의 합계를 구하시오
         * */

        /* 이렇게만 작성되어 있으면 처음 프로그래밍 하는 사람에게는 꽤나 난감하다.
         *  어느 정도 익숙한 사람에게는 저 문제에서 해결해야 하는 내용과 규칙이 머릿속에 자연스럽게 그려지지만
         *  처음 접하는 사람한테는 그렇지 않다.
         *  단계적으로 접근할 수 있도록 위의 내용을 좀 풀어서 다시 작성해본다면
         *  1부터 10까지 1씩 증가시키면서 증가시키는 값을 저장할 변수에 계속 누적시켜 변수에 저장된 값을 출력하세요 가 된다.
         * */

        /* 1부터 10까지를 변수에 저장 */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        /* 결과를 누적시켜 담아줄 변수 선언 */
        /* 더한 값을 누적시킬 변수는 통상 0으로 초기화를 한다. */
        int sum = 0;

        /* sum에 변수의 값 하나씩 담기 */
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        /* sum에 저장된 값 출력 */
        System.out.println("sum : " + sum);

        /* 무엇을 반복하면 좋을까? 반복해야 할 행동을 생각해보자
         *  반복해야 할 내용
         *  1. 변수에 1씩 증가하는 값 담기
         *  2. 저장된 값을 sum에 누적시키기
         *  반복 횟수는? 1부터 10까지 1씩 증가(10번 반복)
         *
         * 반복하지 않을 내용
         *  1. 값을 누적해서 저장할 sum을 초기화
         *  2. sum에 누적된 값 출력
         * */

        int sum2 = 0;

        for(int i = 1; i <= 10; i++){

            sum2 += i;
        }

        System.out.println("sum2 : " + sum2);

    }

    public void testForExample3() {

        /* 목표. 무엇을 반복하지를 확인하여 반복문으로 개선할 수 있다. (3) */

        /* 5 ~ 10 사이의 난수를 발생시켜서
         *  1부터 발생한 난수까지의 합계를 구해보자.
         * */

        int random = (int)(Math.random()*6)+5;

        System.out.println("random : " + random);

        int sum = 0;

        /* 발생한 난수에 따라 더하는 숫자가 달라지기 때문에 조건문을 이용해서 처리해보자  */
        if(random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if(random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if(random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);

        /* 반복문을 이용한 개선 */
        int sum2 = 0;

        for(int i =1; i<=random; i++){

            sum2 += i;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum2);

    }

    public void testForExample4() {

        /* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
         * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
         */

        /* 정수 두 개 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        /* 결과를 누적해서 담을 변수를 0으로 초기화 */
        int sum = 0;

        if(first>second) {

            /* 둘 중 더 작은 second가 시작하는 값이 되고, 더 큰 first가 끝나는 값이 된다. */
            for(int i = second; i <= first; i++ ){

                sum += i;

            }
        }else{

            for(int i = first; i <= second; i++ ){

                sum += i;
            }
        }

        System.out.println("sum : " + sum);

        /* 결국 작은 수 부터 시작해서 큰 수까지의 합계를 구하는 것이기 때문에
         *  first와 second 중 어느 것이 더 큰 수인지를 확인하면
         *  작은수 ~ 큰수 까지의 합계를 구하는 로직으로 바꿀 수 있다.
         * */

        int max = 0;
        int min = 0;

        if(first>second) {

            max = first;
            min = second;

        }else {

            max = second;
            min = first;

        }

        int sum2 = 0;

        for(int i = min; i <= max; i++ ){

            sum2 += i;

        }

        System.out.println("sum2 : " + sum2);

    }

    public void printSimpleGugudan() {

        /* 키보드로 2~9 사이의 구구단을 입력받아
         *  2~9 사이인 경우 해당 단의 구구단을 출력하고,
         *  그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 출력
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단을 입력해 주세요 : ");
        int dan = sc.nextInt();

        if(dan>=2&&dan<=9) {

            for(int i = 1; i <= 9; i++) {

                System.out.println(dan+"*"+i+"="+(dan*i));

            }

        }else {

            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");

        }

        System.out.println("프로그램을 종료합니다.");

    }
}
