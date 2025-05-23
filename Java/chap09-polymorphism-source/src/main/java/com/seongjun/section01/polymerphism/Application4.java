package com.seongjun.section01.polymerphism;

public class Application4 {

    public static void main(String[] args){

        /* 목표. 다형성을 적용하여 리턴타입에 활용할 수 있다. */

        /* 목차. 1. getRandomAnimal() 추가 */

        /* 목차. 2. getRandomAnimal() 호출 */
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomanimal();
        randomAnimal.cry();
    }

    public Animal getRandomanimal(){

        int ramdom = (int)(Math.random()*2);

        return ramdom == 0? new Rabbit() : new Tiger();
    }
}
