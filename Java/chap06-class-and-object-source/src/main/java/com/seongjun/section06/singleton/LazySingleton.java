package com.seongjun.section06.singleton;

public class LazySingleton {

    /* 클래스가 초기화 되는 시점에서는 정적 필드를 선언해두고 null로 초기화된다. */
    private static LazySingleton lazy;

    /* 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다. */
    private LazySingleton(){}

    /* public 인터페이스로 인스턴스를 반환하도록 한다. */

    public static LazySingleton getInstance(){

        if (lazy==null){

            /* 인스턴스를 생성한 적이 없는 경우 새로운 인스턴스 생성 */
            lazy = new LazySingleton();
        }

        return lazy;
    }
}
