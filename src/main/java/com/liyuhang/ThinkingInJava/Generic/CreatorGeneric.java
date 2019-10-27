package com.liyuhang.ThinkingInJava.Generic;

public abstract class CreatorGeneric<T> {

    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}

class X {}

class Creator extends GenericWithCreat<X>{

    @Override
    X creat() {
        return new X();
    }
    void  f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
abstract class GenericWithCreat<T> {
    final T element;
    public GenericWithCreat(){
        this.element = creat();
    }
    abstract T creat();
}