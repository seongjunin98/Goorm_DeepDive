package com.seongjun.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /* 목표. 다른 흐름의 메소드 호출 흐름에 대해 이해 */

        /* 1. methodA(), methodB(), methodC()를 차례대로 작성한다 */
        /* 2. 작성 . 메소드 호출 확인과 실행 종료 출력 구문을 작성하고 다시 현재 위치로 되돌아온다. */
        /* 3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다. */
        System.out.println("main() 시작함...");

        /* 4. methodA(), methodB(), methodC()를 차례대로 호춯한다. */
        Application2 app2 = new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        /* 5. 메인메소드 종료를 확인하는 출력 구문을 작성한다. */
        System.out.println("main() 종료됨...");

        /* 6. main()을 실항하여 전체적잉ㄴ 소스코드의 흐름을 파악. */


    }

    public void methodA() {
        System.out.println("methodA() 호출됨...");

        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");

        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨...");

        System.out.println("methodC() 종료됨...");
    }

}
