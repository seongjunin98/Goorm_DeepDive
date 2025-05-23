package com.seongjun.section04.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application3 {

    public static void main(String[] args){

        /* 목표. time 패키지의 클래스가 제공하는 날짜 비교 연산 메소드를 활용할 수 있다. */
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2020, 11, 11);
        LocalDateTime future = LocalDateTime.of(2025, 3, 11, 12, 0, 0);
        ZonedDateTime now = ZonedDateTime.now();


        /* isAfter(): 현재 시간이 인자로 전달된 시간보다 이후인지 확인
         * isBefore(): 현재 시간이 인자로 전달된 시간보다 이전인지 확인
         * isEqual(): 현재 시간이 인자로 전달된 시간과 같은지 확인 */

        System.out.println(localDate.isAfter(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(now));

    }
}
