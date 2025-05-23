package com.seongjun.section01.extend;

public class RacingCar extends Car{

    /* 목차. 1. extends 키워드를 이용하여 Car 클래스 상속 */
    public RacingCar() {

        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }

    /* 목차. 2. run() 오버라이딩 */
    @Override
    public void run(){

        System.out.println("레이싱카가 전속력으로 질주합니다!");
    }

    /* 목차. 3. soundHorn(), stop() 오버라이딩 */
    @Override
    public void soundHorn(){

        System.out.println("레이싱카는 경적을 울릴 수 없습니다.");

    }
    @Override
    public void stop(){

        System.out.println("레이싱카가 멈춥니다.");
    }
}
