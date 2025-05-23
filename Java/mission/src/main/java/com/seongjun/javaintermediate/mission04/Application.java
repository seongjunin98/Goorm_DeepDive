package com.seongjun.javaintermediate.mission04;

public class Application {

    // 목적. 두 개의 스레드를 생성하여 동시에 실행하기
    // 정보. 두 개의 스레드를 생성하고, 각 스레드에서 고유의 작업을 수행하도록 구현합니다. 두 개의 스레드가 동시에 실행되는 것을 확인합니다. 결과물로 두 개의 스레드가 동시에 실행되는 것을 보여주는 스크린샷을 제출합니다.

    public  static  void main(String[] args){
        System.out.println("메인 프로그램 시작!");

        SimpleTask task1 = new SimpleTask("1");
        SimpleTask task2 = new SimpleTask("2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        System.out.println("스레드 두 개 생성.");

        thread1.start();
        thread2.start();

        System.out.println("두 개의 스레드 시작.");

        try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            System.out.println("메인 스레드 interrupted while waiting.");
        }

        System.out.println("두 스레드 종료.");
    }

}
