package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型extends测试
 * @param <T>
 */
public class Colored<T extends HasColor> {
    T item;
    Colored(T item ){
        this.item = item;
    }
    T getItem(){
        return item;
    }
    java.awt.Color color(){
        return item.getColor();
    }
}

interface HasColor{
    java.awt.Color getColor();
}
