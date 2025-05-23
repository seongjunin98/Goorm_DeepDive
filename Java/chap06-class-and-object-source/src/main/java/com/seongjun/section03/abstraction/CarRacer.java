package com.seongjun.section03.abstraction;

public class CarRacer {

    private final Car car = new Car();

    public void starUp(){car.starUp();}

    public void setpAccelator(){car.go();}

    public void stepBreak(){ car.stop();}

    public void turnOff(){car.turnOff();}
}
