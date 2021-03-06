package com.liyuhang.ThinkingInJava.Generic;

/**
 * 工厂测试
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}

interface FactoryI<T>{
    T creat();
}

class Foo2<T>{
    private T x;
    // Foo2的构造返回值 F 所属 FactoryI<T> 接口工厂制造出来的类
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.creat();
    }
}

class IntegerFactory implements FactoryI<Integer>{

    @Override
    public Integer creat() {
        return new Integer(0);
    }
}

class Widget{
    public static class Factory implements FactoryI<Widget>{
        @Override
        public Widget creat() {
            return new Widget();
        }
    }
}


