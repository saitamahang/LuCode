package com.liyuhang.ThinkingInJava.Generic;

public abstract class CreatorGeneric<T> {
    final T element;
    public CreatorGeneric(){
        this.element = creat();
    }
    abstract T creat();
}
