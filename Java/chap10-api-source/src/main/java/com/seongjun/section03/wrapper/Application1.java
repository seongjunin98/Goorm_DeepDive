package com.seongjun.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. Wrapper 클래스에 대해 이해할 수 있다. */

        /* 기본타입              래퍼클래스
         *  byte          Byte
         *  short         Short
         *  int           Integer
         *  long          Long
         *  float         Float
         *  double        Double
         *  char          Character
         *  boolean       Boolean
         * */

        /*  박싱(Boxing)과 언박싱(UnBoxing)
         *  기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
         *  래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
         * */

        int intValue = 20;
        /* intValue (기본 타입)를 Integer 객체로 변환 (박싱) */
        Integer boxingNumber1 = Integer.valueOf(intValue);      //static 메소드 이용

        /* Integer 객체(boxingNumber)를 int로 변환 (언박싱) */
        int unBoxingNumber1 = boxingNumber1.intValue();         //intValue 이용

        /*  오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
         *  JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일리가 이를 자동으로 처리해준다.
         *  이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱 이라고 부른다.
         * */

        Integer boxingNumber2 = intValue;       //오토 박싱

        int unBoxingNumber2 = boxingNumber2;    //오토 언박싱
    }

}
