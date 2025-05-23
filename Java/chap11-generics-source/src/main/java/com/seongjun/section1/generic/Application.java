package com.seongjun.section1.generic;

public class Application {

    public static void main(String[] args){

        /* 목표. 제네릭(generic)에 대해 이해할 수 있다. */
        /*  제네릭 프로그래밍
         *  데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
         *  재사용성을 높일 수 있는 프로그래밍 방식이다.
         * */

        GenericTest<Integer> gt1 = new GenericTest<>();

        gt1.setValue(Integer.valueOf(10));
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<>();

        gt2.setValue(String.valueOf("장원영"));
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        GenericTest<Double> gt3 = new GenericTest<>();

        gt3.setValue(1.5);
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);




    }
}
