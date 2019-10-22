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

/**
 * 显式的传入类型的Class
 * 可以解决上述类的泛型缺陷问题
 * @param <T> 类型参数
 */
class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }
    public boolean f(Object org){
        return kind.isInstance(org);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

    }
}

class Building {}
class House extends Building{}
