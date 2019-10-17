package com.liyuhang.ThinkingInJava.Generic;

import java.util.HashSet;
import java.util.Set;

/**
 * 泛型基本语法测试
 */
public class FirstGenericTest {
    /**
     * 泛型实现set集合合并，无视类型
     * @param a 集合A
     * @param b 集合B
     * @param <T> 类型参数列表
     * @return 结果集合
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b ){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    /**
     *
     * @param a 集合A
     * @param b 集合B
     * @param c 打酱油的 类型C
     * @param <N> 类型参数N
     * @param <M> 类型参数M
     * @return 测试结果
     */
    public static <N, M> Set<N> intersection (Set<N> a, Set<N> b, M c) {
        Set<N> result = new HashSet<N>(a);
        result.retainAll(b);
        System.out.println(c);
        return  result;
    }

}
