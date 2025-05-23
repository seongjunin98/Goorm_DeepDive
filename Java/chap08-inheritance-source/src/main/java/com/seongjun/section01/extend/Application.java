package com.seongjun.section01.extend;

public class Application {

    public static void main(String[] args){

        /* 상속에 대해 이해할 수 있다. */

        /* 목차. 1. Car 인스턴스 생성 후 메소드 호출 */
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println();

        /* 목차. 2. FireCar 인스턴스 생성 후 Car 클래스에 작성한 메소드를 사용할 수 있는지 확인 */
        FireCar fireCar = new FireCar();

        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        /* 목차. 3. 상속은 확장이다. 추가적인 기능도 작성할 수 있다. */
        fireCar.sprayWater();

        System.out.println();

        /* 목차. 4. RacingCar 인스턴스 생성 후 메소드 호출해서 테스트 */
        RacingCar racingCar = new RacingCar();

        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }
}
