package com.liyuhang.ThinkingInJava.Generic.Common;

/**
 * 定义一个生成器
 * @param <T> 参数化类型
 */
public interface Generator<T> {
    T next();
}
