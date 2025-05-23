package com.seongjun.section02.userexception;

import com.seongjun.section02.userexception.exception.MoneyNegativeException;
import com.seongjun.section02.userexception.exception.NotEnoughMoneyException;
import com.seongjun.section02.userexception.exception.PriceNegativeException;


public class Application3 {

    public  static void main(String[] args) {

        /* 목표. multi-catch 블럭으로 동일한 레벨의 다른 타입의 예외를 하나의 catch블럭으로 처리할 수 있다. */
        /*  JDK 1.7에서 추가된 구문으로
         *  동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 다룰 수 있다.
         * */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 10000);

            /* 예외 상황별로 catch블럭을 따로 작성해서 처리할 수 있다. */
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        } catch (PriceNegativeException | MoneyNegativeException e) {
            /* e.getClass()로 발생한 예외클래스의 이름을 알 수 있다. */
            System.out.println(e.getClass() + " 발생!");
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관 없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함");
        }

        /* 프로그램을 종료하는지 확인 */
        System.out.println("프로그램을 종료합니다.");
    }
}
