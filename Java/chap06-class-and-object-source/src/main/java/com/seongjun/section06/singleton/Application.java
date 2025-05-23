package com.seongjun.section06.singleton;

public class Application {

    public static void main(String[] args){

        /* 목표. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */

        /* 목차. 1. 이른 초기화 구현 */
        /* 생성자를 이용하여 인스턴스 생성을 하지 못하고 getInstance() 메소드를 호출해야만 인스턴스를 생성할 수 있다. */
//		EagerSingleton eager = new EagerSingleton();	//생성자가 private라 접근 불가

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        /* 두 인스턴스의 hashcode가 동일한 것을 알 수 있다. (동일한 인스턴스이다) */
        System.out.println("eager1의 hashcode : " + eager1.hashCode());
        System.out.println("eager2의 hashcode : " + eager2.hashCode());

        /* 목차. 2. 게으른 초기화 구현 */
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        /* 두 인스턴스의 hashcode가 동일한 것을 알 수 있다. (동일한 인스턴스이다) */
        System.out.println("lazy1의 hashcode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashcode : " + lazy2.hashCode());
    }

}
