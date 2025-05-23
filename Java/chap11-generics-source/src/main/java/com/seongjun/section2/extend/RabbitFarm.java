package com.seongjun.section2.extend;

public class RabbitFarm<T extends Rabbit> {

    /* 타입변수는 아직 어떤 토끼가 퇼 지 모른다. 다만 토끼이거나 토끼의 후손만 가능하다. */
    public T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {this.animal = animal;}

    public void setAnimal(T animal) {this.animal = animal;}

    public T getAnimal(){return this.animal;}

}
