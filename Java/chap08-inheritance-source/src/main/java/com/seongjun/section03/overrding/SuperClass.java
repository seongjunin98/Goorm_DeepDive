package com.seongjun.section03.overrding;

public class SuperClass {

    /* 목표. 오버라이딩(overriding)에 대해 이해할 수 있다. */

    /* 오버라이딩 테스트를 위한 기준이 되는 메소드 */
    public void method(int num) {

        System.out.println("SuperClass의 method() 메소드 호출: " + num);
    }

    private void privateMethod() {}

    public final void finalMethod(){}

    protected void protectedMethod(){}
}
