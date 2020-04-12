package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型的自限定类型
 */
public class BasicHolder<T> {
    T element;
    void set(T arg){
        element = arg;
    }
    T get(){return element;}
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}

class Subtype extends BasicHolder<Subtype>{
    public static void main(String[] args) {
        Subtype st1 = new Subtype();
        Subtype st2 = new Subtype();
        st1.set(st2);

        Subtype st3 = st1.get();
        st1.f();
    }
}
