package com.seongjun.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. 스트림의 최종연산중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
        /*  Calculating
         *  스트림에서는 다양한 메소드들을 제공하는데, 먼저 최소/최대/총합/평균 등 과 같은 결과를 알아보자.
         * */

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        int oddSum = IntStream
                .range(1, 10)
                .filter(i -> i % 2 == 1)
                .sum();
        System.out.println("oddSum : " + oddSum);
    }
}
