package com.liyuhang.ThinkingInJava.Generic;

public abstract class CreatorGeneric<T> {
    final T element;
    public CreatorGeneric(){
        this.element = creat();
    }
    abstract T creat();
}

class X {}

class  creator extends CreatorGeneric<X>{

    @Override
    X creat() {
        return new X();
    }
    void  f(){
        System.out.println(element.getClass().getSimpleName());
    }
}