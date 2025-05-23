package com.seongjun.section07.kindsofvariable;

public class KindsOfVariable {

    /* 목표. 다양한 변수들을 이해하고 사용할 수 있다. */

    /* non-static field를 인스턴스변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미) */
    private int globalNum;

    /* static file를 정적필드(클래스변수) 라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미이다) */
    private static int staticNum;

    public void testMethod(int num){    //메소드영역의 시작

    int localNum;

    System.out.println(num);            //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.

    /* 지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 되어야 한다. */

//        System.out.println(localNum);     //전역 변수는 클래스 전역에서 사용 가능하다.

        System.out.println(globalNum);
        System.out.println(staticNum);
    }   //메소드 영역의 끝

    /* 새로운 메소드 만들고 전역변수와 지역변수에 대한 접근 */
    public void testMethod2(){

        //		System.out.println(localNum); 		//지역변수는 해당 지역(블럭 내)에서만 사용 가능하다.
        System.out.println(globalNum);		//전역변수는 다른 메소드에서도 사용 가능하다.
        System.out.println(staticNum);
    }
} //클래스 영역의 끝


