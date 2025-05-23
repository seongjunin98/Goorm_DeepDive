package com.seongjun.section01.string;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args){

        /* 목표. 문자열 분리에 대해하고 적용할 수 있다.*/
        /* 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
         *  split() : 정규표현식을 이용하여 문자열을 분리한다.
         *            비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
         *            정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
         *  StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
         *                    정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
         *                    split()보다 속도면에서 더 빠르다.
         *                    구분자를 생략하는 경우 공백이 기본 구분자이다.
         * */

        /* 사번/이름/주소/부서 */
        String emp1 = "100/홍길동/서울/영업부";     //모든 값 존재함
        String emp2 = "200/유관순//총무부";        //주소 없음
        String emp3 = "300/이순신/경기도/";        //부서 없음

        String[] empArry1 = emp1.split("/");
        String[] empArry2 = emp2.split("/");
        String[] empArry3 = emp3.split("/");

        for(int i =0; i< empArry1.length; i++){
            System.out.println("empArry1[" + i +"] : " + empArry1[i]);      //정상출력
        }

        for (int i=0; i<empArry2.length; i++){
            System.out.println("empArry2[" + i + "] : " + empArry2[i]);     //중간값 빈 문자열
        }

        for (int i = 0; i< empArry3.length; i++){
            System.out.println("empArry3[" + i + "] : " + empArry3[i]);     //마지막 값 출력이 안됨
        }

        /* 마지막 구분자 사이에 값이 존재하지 않는 경우 이후 값도 추출하고 싶을 때 */
        String[] empArry4 = emp3.split("/",-1);
        for (int i=0; i< empArry4.length; i++){
            System.out.println("empArry4["+ i + "] : " + empArry4[i]);
        }

        /* 반면 StringTokenizer의 경우 공백으로 존재하는 값을 무시해버린다. */
        StringTokenizer str1 = new StringTokenizer(emp1, "/");
        StringTokenizer str2 = new StringTokenizer(emp2, "/");
        StringTokenizer str3 = new StringTokenizer(emp3, "/");

        while (str1.hasMoreTokens()){
            System.out.println("str1 : " + str1.nextToken());
        }

        while (str2.hasMoreTokens()){
            System.out.println("str2 : " + str2.nextToken());
        }

        while (str3.hasMoreTokens()){
            System.out.println("str3 : " + str3.nextToken());
        }

        /* nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용 하는 것이 불가능하다. */
        while (str1.hasMoreTokens()){
            System.out.println("str1 : " + str1.nextToken());
        }
    }
}
