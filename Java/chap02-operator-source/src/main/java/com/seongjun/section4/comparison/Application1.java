package com.seongjun.section4.comparison;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 비교연산자에 대해 이해하고 활용 */
        /* 비교연산자
         *  비교연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
         *  연산자 중 . 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다. (충분히 연습 필요)

         * 비교연산자의 종류
         *  '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
         *  '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
         *  '>'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
         *  '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
         *  '<'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
         *  '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
         */

        /* 숫값 비교. */

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum == inum2 ? " + (inum1 == inum2));
        System.out.println("inum1 != inum2 ? " + (inum1 != inum2));
        System.out.println("inum1 > inum2 ? " + (inum1 > inum2));
        System.out.println("inum1 >= inum2 ? " + (inum1 >= inum2));
        System.out.println("inum1 < inum2 ? " + (inum1 < inum2));
        System.out.println("inum1 <= inum2 ? " + (inum1 <= inum2));

        /* 논리값 비교 */
        /* ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 =  true;
        boolean bool2 = false;

        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
        //System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
        //System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
        //System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
        //System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));

        /* 문자열값 비교 */
        /* 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능 */

        String str1 = "jaVa";
        String str2 = "java";

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
        //System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
        //System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
        //System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
        //System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));

        /* 두 미지수 x,y 값응ㄴ 각각 10,11이다. y는 x보다 크거나 같다는 것을 논리형으로 나타내보자 */

        int x = 10;
        int y = 11;

        boolean result = y >= x;

        System.out.println("y는 x보다 크거나 같은가? " + result);


    }
}
