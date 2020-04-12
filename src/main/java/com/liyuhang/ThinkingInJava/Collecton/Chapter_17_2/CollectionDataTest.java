package com.liyuhang.ThinkingInJava.Collecton.Chapter_17_2;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @auther liyuhang
 * @date 2020/3/1 16:29
 *
 * 一个简单的适配器模式的实例
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}

class Government implements Generator<String> {
    private int index;

    String[] foundtion = ("strange women lying in ponds distribuing swords is no " +
            "basis for a system of government").split(" ");

    @Override
    public String next() {
        return foundtion[index++];
    }
}
