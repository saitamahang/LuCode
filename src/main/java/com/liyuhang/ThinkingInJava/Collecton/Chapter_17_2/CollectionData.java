package com.liyuhang.ThinkingInJava.Collecton.Chapter_17_2;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;

import java.util.ArrayList;

/**
 * @auther liyuhang
 * @date 2020/3/1 16:13
 *
 * 一个简单的适配器：将Generator适配到Collection
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for(int i = 0; i < quantity; i++){
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen, quantity);
    }
}
