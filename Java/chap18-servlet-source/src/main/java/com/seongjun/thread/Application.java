package com.seongjun.thread;

public class Application {

    public static void main(String[] args){

        Car car = new Car();
        Tank tank = new Tank();
        Plane plane = new Plane();

        /* 1. 객체 생성 후 Thread 타입의 인스턴스로 변환 */
        Thread t1 = car;
        Thread t2 = tank;
        Thread t3 = new Thread(plane);

        /* 2. 바로 생성 */
//        Thread t1 = new Car();
//        Thread t2 = new Tank();
//        Thread t3 = new Thread(new Plane());

//		t1.run();       //스레드를 사용, 멀티는 x
//		t2.run();
//		t3.run();

        t1.start();     //멀티스레드를 사용
        t2.start();
        t3.start();

        System.out.println("--------------- main end!!!!");
    }
}
