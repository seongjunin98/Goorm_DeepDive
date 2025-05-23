package com.seongjun.section01.intro;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 람다식에 대해 이해하고 사용할 수 있다. */
        /*  람다(lambda)식
         *  람다식을 사용하는 장점은 단순함이다.
         *  람다식을 활용하면 컬렉션, 스트림을 연계하여 데이터를 쉽게 조작할 수 있으며, 불필요하게 반복되는 코드도 제거할 수 있다.
         *  러닝커브가 존재하며, 객체지향 프로그래밍 사상에 위배되기 때문에 호불호가 갈리긴 하지만
         *  최근에는 람다와 스트림을 적극적으로 활용하는 추세이다.
         * */

        /* 람다식을 사용하기 위해 Calculator 인터페이스를 만든다. */

        /*  인터페이스에 정의된 추상메소드를 활용하기 위해서는 3가지 방법이 있다.
         *  1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
         *  2. 익명클래스를 활용하여 메소드 재정의 후 사용하는 방법
         *  3. 람다식을 활용하는 방법
         * */

        /* 목차. 1. 인터페이스를 구현한 구현체를 이용한 방식 */
        Calculator c1 = new CalculatorImpl();
        System.out.println("c1. 10 + 20 = " + c1.sumTwoNumber(10, 20));

        /* 목차. 2. 익명클래스를 활용한 방식 */
        Calculator c2 = new Calculator() {

            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println("c2. 20 + 30 = " + c2.sumTwoNumber(20, 30));

        /* 목차. 3. 람다식을 활용한 방식 */
        Calculator c3 = (x, y) -> x + y;
        System.out.println("c3. 40 + 50 =  " + c3.sumTwoNumber(40, 50));
    }
}
