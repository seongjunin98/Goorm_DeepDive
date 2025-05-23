package com.seongjun.section01.polymerphism;

public class Application1 {

    public static void main(String[] args){

        /* 목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */


        /* 목차. 1. Animal, Rabbit, Tiger 클래스를 만들어보자 */

        /* 목차. 2. Animal 인스턴스 생성 후 메소드 호출 확인 */
        System.out.println("Animal 생성 --------------------");
        Animal animal = new Animal();
        animal.eat();
        animal.cry();
        animal.run();

        System.out.println();

        /* 목차. 3. Rabbit 인스턴스 생성 후 메소드를 호출 확인 */
        System.out.println("Rabbit 생성 ------------------------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println();


        /* 목차. 4. Tiger 인스턴스 생성 후 메소드 호출 확인 */
        System.out.println("Tiger 생성 --------------------------------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        /* 목차. 5. 부모 타입으로 자식 인스턴스 주소값 저장 */
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

//		Rabbit r = new Animal();		//에러남
//		Tiger t = new Animal();			//에러남

        /* 목차. 6. 동적 바인딩 확인 */
        System.out.println("동적바인딩 확인 ------------------------------");
        a1.cry();
        a2.cry();

//		a1.jump();		//에러남
//		a2.bite();		//에러남

        System.out.println();

        System.out.println("클래스타입 형변환 확인 --------------------------");
        ((Rabbit) a1).jump();
        ((Tiger) a2).bite();

        /* 목차. 8. instanceof 연산자 사용 확인 */
        System.out.println("instanceof 확인 ----------------------------");
        System.out.println("a1이 Tirger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        /* 상속 받은 타입도 함께 가지고 있다(다형성) */
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        /* 모든 클래스는 Object의 후손이다. */
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));

        System.out.println();

        /* instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스형변환을 적용한다. */
        if(a1 instanceof Rabbit){
            ((Rabbit)a1).jump();
        }

        if (a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }else {
            System.out.println("이 동물은 호랑이 입니다.");
        }

        /* 목차. 9. 클래스의 업캐스팅과 다운캐스팅 확인 */
		/*  묵시적 형변환
		 *  up-casting의 경우 묵시적 형변환이 적용된다.
         * */
        Animal animal1 = (Animal) new Rabbit();		//up-casting 명시적 형변환
        Animal animal2 = new Rabbit();				//up-casting 묵시적 형변환

        Rabbit rabbit1 = (Rabbit) animal1;			//down-casting 명시적 형변환
//		Rabbit rabbit2 = animal12;					//down-casting 묵시적 형변환 안됨
    }

}
