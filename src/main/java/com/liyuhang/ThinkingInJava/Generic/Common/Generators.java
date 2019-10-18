package com.liyuhang.ThinkingInJava.Generic.Common;

import java.util.Collection;

/**
 * 生成器
 */
public class Generators {
    public static <T> Collection<T> fill (Collection<T> coll, Generator<T> gen, int  n ){
        for (int i = 0; i < n ;i++ ){
            coll.add(gen.next());
        }
        return coll;
    }
}
