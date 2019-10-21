package com.liyuhang.ThinkingInJava.Generic;

import java.util.ArrayList;

/**
 * 泛型类型擦除机制测试
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        //类型参数被擦除，在泛型外部无法区分类型参数
        System.out.println(c1 == c2);
    }
}
