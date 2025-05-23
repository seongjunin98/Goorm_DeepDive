package com.seongjun.section01.polymerphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 듣어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 전속력으로 달립니다!!!!");
    }

    @Override
    public void cry(){
        System.out.println("호랑이가 울부짖습니다. 어흐으으으으응~!!");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다. 으앙!");
    }
}
