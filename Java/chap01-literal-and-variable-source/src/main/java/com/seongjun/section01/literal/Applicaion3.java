package com.seongjun.section01.literal;

public class Applicaion3 {

    public static void main(String[] args) {

        /* 목표. 문자열 합치기 결과 예측과 사용 */
        /* 목차. 1. 두 개의 문자열 합치기 */
        System.out.println("========== 두 개의 문자열 합치기 ==========");
        System.out.println(9+9);                    //18
        System.out.println("9"+9);                  //99

        /* 목차. 2. 세 개의 문자열 합치기 */
        System.out.println(9+9+"9");                //189       //연산 방향은 왼쪽에서 오른쪽
        System.out.println(9+"9"+9);                //999       //왼쪽의 연산이 문자열과 합쳐지고 오른쪽 연산이 진행됌
        System.out.println("9" + 9 + 9);	    	//999       //진행 과정에서 문자열과 숫자가 더해져 문자열이 됌
        System.out.println("9" + (9 + 9));		    //918       //수학의 사칙연산과 마찬가지로 괄호를 우선순위에 둠

        /* 목차. 3. 문자열 합치기 응용 */
        System.out.println("========== 사직연산 결과를 보기 좋게 출력 ==========");
        System.out.println("10+20의 값은 : " + (10+20));       //주의. 괄로를 묶지 않으면 문자열과 합쳐져 1020이 된다.

    }
}
