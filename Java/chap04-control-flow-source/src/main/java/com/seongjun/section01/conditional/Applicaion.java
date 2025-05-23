package com.seongjun.section01.conditional;

public class Applicaion {

    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if문 흐름 확인용 메소드 호출 */
//        a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 호출 */
//        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        /* 단독 if-else 문 흐름 확인용 메소드 호출 */
//        b.testSimpleIfElseStatement();

        /* 중첩 if-else 문 흐름 확인용 메소드 호출 */
//        b.testNestedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        /* 단독 if-else 문 흐름 확인용 메소드 호출 */
//        c.testSimpleIfElseIfStatement();

        /* 중첩 if-else-if 문 흐름 확인용 메소드 호출 */
//        c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        /* switch문 흐름 확인용 메소드 호출 */
//        d.testSimp123leSwitchStatement();

        /* 문자열값 비교 및 break 테스트 */
        d.testSwitchVendingMachine();
    }
}
