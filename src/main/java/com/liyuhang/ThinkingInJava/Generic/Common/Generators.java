package com.liyuhang.ThinkingInJava.Generic.Common;

import java.util.Collection;

/**
 * 填充器
 */
public class Generators {
    /**
     * 定义一个填充器
     * @param coll 待填充的容器
     * @param gen 生成器（生产填充容器的元素）生产内容由Generator<T>接口的实现类动态定义
     * @param n 数量
     * @param <T> 类型参数
     * @return 填充后的容器
     */
    public static <T> Collection<T> fill (Collection<T> coll, Generator<T> gen, int  n ){
        for (int i = 0; i < n ;i++ ){
            coll.add(gen.next());
        }
        return coll;
    }
}
