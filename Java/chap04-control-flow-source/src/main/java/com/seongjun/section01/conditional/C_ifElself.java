package com.seongjun.section01.conditional;

import java.util.Scanner;

public class C_ifElself {

    public void testSimpleIfElseIfStatement() {

        /*  금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오대로
         *  코드를 작성하고 실행하보자!
         * */

        System.out.println("산 속에서 나무를 하더 ㄴ나무꾼이 연못에 도끼를 빠트리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보왔다.");

        /* 문자열 비교하는 equals()를 사용해 문자열로 입력을 받아도된다. */
        System.out.println("어느 도끼가 너의 도끼이냐? (1.금도끼 2.은도끼 3.쇠도끼 : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        /* 대답한 내용이 금도끼인지 확인하는 조건식 */
        if (answer == 1) {

            System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");

        }else if (answer == 2) {

            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");

        } else {

            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");

        }

        System.out.println("그렇게 산신령은 다시 연목 속으로 사라지고 말았다...");


    }

    public void testNestedIfElseIfStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println("학생의 점수를 입력하세요 : ");
        int point =  sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        /* 학점등급을 매기기 위해 점수를 확인하기 위한 조건문 */
        if (point>=90){

            /* 점수가 90점 이상인 경우 */
            grade = "A";

            /* 등급은 A등급인데 그럼 +가 붙을 자격이 있는지(95점 이상인지) 다시 확인 */
            if(point>=95){

                grade += "+";
            }

        } else if (point>=80){

            grade = "B";

            if(point>=85){

                grade += "+";

            }
        } else if (point>=70){

            grade = "C";

            if(point>=75){

                grade += "+";
            }
        }else if (point>=60){

            grade = "D";

            if(point>=65){

                grade += "+";
            }
        } else{

            grade = "F";
        }

        /* 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은" + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");

    }
}
