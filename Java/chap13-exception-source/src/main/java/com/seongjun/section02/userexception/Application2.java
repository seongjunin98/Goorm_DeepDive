package com.seongjun.section02.userexception;

import com.seongjun.section02.userexception.exception.MoneyNegativeException;
import com.seongjun.section02.userexception.exception.NotEnoughMoneyException;
import com.seongjun.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /* 목표. 다양한 타입의 예외를 multi block을 이용해서 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 30000);

            /* 예외 상황별로 catch블럭을 따로 작성해서 처리할 수 있다. */
        } catch (NotEnoughMoneyException e) {

            /* 예외 인스턴스 생성 시 전달한 메세지를 getMessage()로 가져올 수 있다. */
            System.out.println("NotEnonughMoneyException 발생!");
            System.out.println(e.getMessage());

        } catch(PriceNegativeException e) {

            System.out.println("PriceNegativeException 발생!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {

            System.out.println("MoneyNegativeException 발생!");
            System.out.println(e.getMessage());
        }finally {
            /* 예외 발생 여부와 상관 없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함");
        }

        /* 프로그램을 종료하는지 확인 */
        System.out.println("프로그램을 종료합니다.");
    }
}
