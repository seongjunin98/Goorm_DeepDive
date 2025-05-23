package com.seongjun.section01.intro;

/*  인터페이스 내부에 하나의 추상메소드가 선언된 인터페이스만 람다식의 타깃이 될 수 있다.
 *  이러한 인터페이스를 함수적 인터페이스(functional interface)라고 하며,
 *  해당 조건을 만족하는지를 컴파일 시점에 체크를 해주는 기능이 @FunctionalInterface 어노테이션이다.
 *  */
@FunctionalInterface
public interface Calculator {

        public int sumTwoNumber(int a, int b);

//        public int minTwoNumber(int a, int b);
    }

