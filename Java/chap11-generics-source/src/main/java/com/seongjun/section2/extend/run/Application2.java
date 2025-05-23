package com.seongjun.section2.extend.run;

import com.seongjun.section2.extend.*;

public class Application2 {

    public static void main(String[] args){

        /* 목표. 와일드카드에 대해 이해할 수 있다. */
        /*  와일드카드(WildCard)
         *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         *  그 객체의 타입 변수를 제한할 수 있다.
         *  <?> : 제한 없음
         *  <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
         *  <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//		wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//		wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /*  Bunny이거나 Bunny의 후손 토끼농장만 매개변수로 사용이 가능하고
         *  상위타입으로 만든 토끼농장은 매개변수로 사용이 불가능하다.
         * */
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /*  Bunny이거나 Bunny의 상위 타입 토끼 농장만 매개변수로 사용이 가능하고
         *  하위타입으로 만든 토끼 농장은 매개변수로 사용이 불가능하다.
         * */
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
