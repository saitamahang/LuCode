package com.liyuhang.ThinkingInJava.Generic;

/**
 * 工厂测试
 */
public class FactoryConstraint {

}

interface FactoryI<T>{
    T creat();
}

class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.creat();
    }
}
