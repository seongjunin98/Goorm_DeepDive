package com.seongjun.section03.overrding;

public class Application {

        public static void main(String[] args) {
            SuperClass superClass = new SuperClass();
            superClass.method(1); // SuperClass의 method() 호출

            SubClass subClass = new SubClass();
            subClass.method(2); // SubClass의 method() 호출 (오버라이딩)
        }
}
