package com.seongjun.section2.extend.run;

import com.seongjun.section2.extend.*;

public class Application1 {

    public static void main(String[] args){

        /* 목표. extends 키워드를 이용하여 특정 타입만 시용하도록 제네릭 범위를 제한할 수 있다. */
        /*  제네릭 클래스 작성 시 extends 키워드를 이용하면
         *  특정 타입만 사용하도록 제한을 걸 수 있다.
         * */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//
//        RabbitFarm<snake>  farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        farm3.setAnimal(new Snake());

        /*  Rabbit이나 Rabbit의 후손타입으로는 가능하다.
         *  제네릭을 사용해서 올바른 타입을 타입변수로 지정하는 경우에는
         *  인스턴스 내부에 있는 타입 자체가 Rabbit 타입을 가지고 있는 것이 보장되어 있기 때문에 형변환 생략 가능하다.
         * */

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry();
        farm4.getAnimal().cry();                    //형변환 생략 가능

        farm5.setAnimal(new Bunny());
        ((Bunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();                    //형변환 생략 가능

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();
        farm6.getAnimal().cry();                    //형변환 생략 가능
    }
}
