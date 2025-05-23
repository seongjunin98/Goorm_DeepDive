package com.seongjun.section5.logical;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 논리연산자에 대해 이해하고 활용 */
        /* 논리 연산자
         * 논리값(true of false)를 취급하는 연산자이다.
         *
         *  논리 연산자의 종류
         *   1. 논리 연결 연산자 : 두 개의 피 연산자를 가지는 이항 연산자이며, 연산자의 결함 방향은 왼쪽에서 오른쪽이다. 두개의 논리 식을 판단하여 참과 거짓을 판단.
         *      1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 참을 반환, 둘 중 한개라도 거짓인 경우 거짓을 반환하는 연산자.
         *      1-2. ||(논리 OR) 안션자 : 두 개의 논리식 중 둘 중 하나라도 참 일 경우 참을 반환, 모두 거짓일 경우 거짓은 반환
         *  2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향은 왼쪽에서 오른쪽이다.
         *      1-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
         */

        /* 논리 연산자 결과값 확인 */
        System.out.println("true, true 일 때 &&의 결과값 : " + (true&&true));
        System.out.println("true, false 일 때 &&의 결과값 : " + (true&&false)); //반대 또한 동일
        System.out.println("false, false 일 때의 && 값 : " + (false&&false));

        System.out.println("true, true 일 때 ||의 값 :  " + (true||true));
        System.out.println("false, true 일 때 ||의 값 :  " + (false||true)); // 반대 동일
        System.out.println("false, false 일 때 ||의 값 :  " + (false||false));

        System.out.println("true의 논리 not 연산 : " + !(true));
        System.out.println("fales의 논리 not 연산 : " + !(false));

        /* 논리식에 논리연산자 활용 */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d 보다 작은가? : " + (a<b&&c<d));
        System.out.println("a가 b보다 작으면서 c가 d 보다 큰가? : " + (a<b&&c>d));
        System.out.println("a가 b보다 크면서 c가 d 보다 작은가? : " + (a>b&&c>d));
        System.out.println("a가 b보다 크면서 c가 d 보다 작은가가? : " + (a>b&&c<d));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));

        /* 목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /* 논리 연산자의 우선순위와 활용
         * 논리 and 연산자와 논리 or 연산자 우선순위보다 높다.
         */

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게 사용 못함 --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야함 */
        int num1 = 55;
        System.out.println("1부터 100 사이의 숫자 인가? " + (num1>=1 && num1<=100));

        int num2 = 166;
        System.out.println("1부터 100 사이의 숫자 인가? " + (num2>=1 && num2<=100));

        /* 2. 영어 대문자인지 확인 */
        /* 영어 대문자인가? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
        char ch1 = 'G';
        System.out.println("ch1은 대문자인가 ? " + (ch1>='A' && ch1<='Z'));

        char ch2 = 'g';
        System.out.println("ch2은 대문자인가 ? " +  (ch2>='A' && ch2<='Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        /* 문자변수 == 'y' || 문자변수 == 'Y' */
        char ch3 = 'Y';
        System.out.println("ch은 영문자 y인가 ? " + (ch3=='Y'||ch3=='y'));
        char ch4 = 'y';
        System.out.println("ch은 영문자 y인가 ? " + (ch3=='Y'||ch3=='y'));

        /* 4. 영문자인지 확인 */
        /* A :65, Z : 90, a : 97, z: 122 (중간 91~96까지는 영문자가 아님) */

        char ch5 = 'f';
        System.out.println("ch5는 영문자 인가? " + ((ch5>='A'&& ch5<='Z')||(ch5>='a'&& ch5<='z')));
        System.out.println("ch5는 영문자 인가? " + ((ch5>=65&& ch5<=90)||(ch5>=97&& ch5<=122)));

        char ch6 = 'F';
        System.out.println("ch6은 영문자 인가? " + ((ch6>='A'&& ch6<='Z')||(ch6>='a'&& ch6<='z')));
        System.out.println("ch6은 영문자 인가? " + ((ch6>=65 && ch6<=90)||(ch6>=97&&ch6<=122)));

        /* 목표. 논리연결연산자의 진리표에 대해 이해 */
        /* AND 연산과 OR 연산의 특징
         * 논리식 && : 앞의 결과가 false이면 뒤를 실행 안함
         * 논리식 || : 앞의 결과가 true이면 뒤를 실행 안함
         */

        /* 1. 논리식 && : 앞의 결과가 false 이면 뒤를 실행 안함 */
        /* 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오면
         * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편.
         */

        int num3 = 10;

        /* 앞에 조건을 true로 강제화 해 두고 || 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건으로 만듬.
         * nu3 선치 증가 코드가 동작했다면 result2는 11일 것이고, 동작하지 않았다면 결과는 10일 것이다. */

        int result2 = (true || ++num3 >0)? num3 : num3;
        System.out.println(" 결과 값 확인 : " + result2);


    }
}
