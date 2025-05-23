package com.seongjun.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 메소드의 호출 흐름에 대해 이해할 수있다. */
        /* 메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
         */

        /* 자세한 메소드 사용법은 객체 부분에서 다루게 됨. 지금은 호출 흐름에 대해 이해 */

        System.out.println("main() 시작됨...");

        /* 1. main method 밖에 하단에 methodA라는 메소드를 추가한다. */

        /* 2. 작성한 메소드를 호출하는 부분을 작성한다.
         * 메소드 호출 방법
         * 클래스명 사용할 이름 = new 클래스명();        //객체 생성
         * 사용할이름.메소드면()                         //메소드 호출
         *
         */

        Application1 app1 = new Application1();
        app1.methodA();

    }

    /* 1-1. methodA 작성 */

    public void methodA() {

        System.out.println("methodA() 호출됨...");

        /* 1-2. methodB 호출 */
        methodB();          //메소드 호출 방식이 약간 다르다. 지금은 흐름에 집중하고 뒤에서 다시 다룬다.

        System.out.println("methodA 종료됨...");
    }

    /* 1-3. methodB 작성 */
    public void methodB() {

        System.out.println("methodB 호출됨...");

        /* 1-4. methodC 호출 */
        methodC();

        System.out.println("methodB 종료됨...");

    }

    /* 1-5. methodC 작성 */
    public void methodC() {

        System.out.println("methodC 호출됨...");

        System.out.println("methodC 종료됨...");

    }
}
