package com.seongjun.section1.generic;

public class GenericTest<T> {

    private T value;

    public void setValue(T value){this.value = value;}

    public T getValue(){return this.value;}
}
