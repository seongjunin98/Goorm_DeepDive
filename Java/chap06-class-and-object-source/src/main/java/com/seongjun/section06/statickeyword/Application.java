package com.seongjun.section06.statickeyword;

public class Application {

    public static void main(String[] agrs){

        /* 목표. static 키워드에 대해 이해할 수 있다. */

        /* 목차. 1. static 키워드를 필드에서 사용 */
        /* StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sft1 = new StaticFieldTest();

        /* 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static filed : " + sft1.getNonStaticCount());       //0
        System.out.println("static filed : " + sft1.getStaticCount());              //0

        /* 두 필드의 값 1씩 증가 후 다시 값 확인 */
        sft1.increaseStaticCount();
        sft1.increaseNonStaticCount();

        System.out.println("non-static filed : " + sft1.getNonStaticCount());       //1
        System.out.println("static filed : " + sft1.getStaticCount());              //1

        /* 새로운 StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sft2 = new StaticFieldTest();

        /* 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static files : " + sft2.getNonStaticCount());        //0 새로운 값 생성
        System.out.println("static filed : " + sft2.getStaticCount());               //1 값 유지

        /* 목차. 2. static 메소드 확인 */
        /* 목차. 2-1. non-static 메소드 호출 */
        /* StaticMethodTest 인스턴스 생성 후 호출 */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        smt.staticMethod();                        // 권장하지 않음

        /* 목차. 2-2. static 메소드 호출 */
		/* 클래스명.메소드명으로 인스턴스를 생성하지 않고 호출할 수 있다. */
        StaticMethodTest.staticMethod();            // 권장함

    }
}
