package com.seongjun.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다. */
        /* 배열과 컬렉션 객체의 stream() 메소드를 활용한 스트림 생성 */

        /* 배열 스트림 생성 */
        String[] sarr = new String[]{"java", "oracle", "jdbc"};

        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        Stream<String> strStream2 = Arrays.stream(sarr, 0 ,2);
        strStream2.forEach(System.out::println);

        /* 컬렉션 스트림 생성 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");

        Stream<String> strStream3 = stringList.stream();
        strStream3.forEach(System.out::println);

        /* 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다. */
        stringList.forEach(System.out::println);
    }
}
