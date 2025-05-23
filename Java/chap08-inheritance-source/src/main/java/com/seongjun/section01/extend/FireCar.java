package com.seongjun.section01.extend;

public class FireCar extends Car {

    /* 목차. 1. extends 키워드를 이용하여 Car 클래스 상속 */
    public FireCar() {

        super();

        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    /* 목차. 2. soundHorn() 오버라이딩 */
    @Override
    public void soundHorn(){

        if (isRunning()){

            System.out.println("삐용삐용삐용");
        }else {

            System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요~");
        }
    }

    /* 목차. 3. 물뿌리는 기능 추가 */
    public void sprayWater(){

        /* 소방차는 추가적으로 물뿌리는 기능을 수행할 수 있다. */
        System.out.println("소방차가 물을 뿌립니다!");
    }
}
