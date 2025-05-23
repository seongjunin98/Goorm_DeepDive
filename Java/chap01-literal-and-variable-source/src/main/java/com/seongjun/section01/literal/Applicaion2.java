package com.seongjun.section01.literal;

public class Applicaion2 {

    public static void main(String[] args) {

        /* 목차 1. 숫자와 숫자의 연산 */
        /* 목차. 1-1. 정수와 정수의 연산 */
        /* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산(mod)을 사용할 수 있다 */
        System.out.println("========== 정수와 정수의 연산 ==========");
        System.out.println(123+123);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 12);
        System.out.println(123 % 12);

        /* 목차 1-2. 실수와 실수의 연산 */
        /* 실수기리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산(mod)을 사용할 수 있다 */
        System.out.println("========== 실수와 실수의 연산 ==========");
        System.out.println(2.46 + 123.3);

        /* 목차. 1-3. 정수와 실수의 연산 */
        /* 정수와 실수의 연산도 수학에서 사용되는 사칙 연산에 나머지를 구하는 연산을 사용할 수 있다. */
        /* 정수와 실수 연산시 결과는 항상 실수. */
        System.out.println("========== 정수와 실수의 연산 ==========");
        System.out.println(123*0.2);

        /* 목차. 2. 문자의 연산 */
        /* 목차. 2-1. 문자와 문자의 연산 */
        /* 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
        System.out.println("========== 문자와 문자의 연산 ==========");
        System.out.println('a'+'A');                    //아키식코드에 의해 숫자로 계산됌. a=97 A=56

        //이러한 문자는 정수와 실수 또한 연산 가능하다.
        System.out.println("========== 문자와 실수,정수 연산 ==========");
        System.out.println('a' + 1);
        System.out.println('a' * 1.2);

        /* 목차. 3. 문자열의 연산 */
        /* 목차. 3-1. 문자열과문자열의 연산 결과는 문자열 합치기(이어 붙이기)가 된다. */
        /* 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다. */
        System.out.println("========== 문자열과 문자열의 연산 ==========");
        System.out.println("안녕하세요"+"반갑습니다");
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생
        //다음과 같이 +를 제외한 사칙연산은 문자열의 연산에서 에러가 발생한다.

        /* 목차. 3-2 문자열과 다른 형태의 값 연산 */
        /* 문자열과의 연산은 + 연산만 가능 */
        /* 연산 결과는 다른 형태의 값들도 문자열로 취급! 문자열 이어붙이기(합치기) 결과가 나옴. */
        System.out.println("========== 문자열과 다른 형태의 값 연산 ==========");
        System.out.println("helloworld"+123);
        System.out.println("helloworld"+123.33);
        System.out.println("helloworld"+'a');
        System.out.println("helloworld"+true);

        /* 주의사항. 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는것 */
        System.out.println("========== 문자열 형태의 숫자 값 '+' 연산 ==========");
        System.out.println("123"+"456");

        /* 목차. 4. 논리값 연산 */
        /* 논리값은 또 다른 논리값, 정수, 실수, 문자와의 연산은 모든 연잔자 사용이 불가능! */
        //System.out.println(true + false);				//에러 발생
        //System.out.println(true * 1);				    //에러 발생
        //System.out.println(true / 2.0);				//에러 발생
        //System.out.println(true * 'a');				//에러 발생

        /* 논리값과 문자열의 연산은 '+'연산만 사용 가능 */
        System.out.println("========== 논리와 문자열의 연산 ===========");
        System.out.println(true+"진실");                  //문자열 합치기

    }
}
