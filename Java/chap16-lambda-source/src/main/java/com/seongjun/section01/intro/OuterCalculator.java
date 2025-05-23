package com.seongjun.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum{
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus{
        int minsuTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiplTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Devide {
        int devideTwoNuber(int a, int b);
    }
}
