package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型办不到的事
 * @auther liyuhang
 * @date 2019/10/22 17:33
 */
public class GenericShotComing<T> {
    private final int SIZE = 30;
    private static void f(Object org){
        // if (org instanceof T) {};
        // T var = new T();
        // T[] array = new T[SIZE];
        // T[] array = (T)new Object()[SIZE];
    }
}
