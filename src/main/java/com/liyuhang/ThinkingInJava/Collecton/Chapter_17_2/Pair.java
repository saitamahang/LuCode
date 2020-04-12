package com.liyuhang.ThinkingInJava.Collecton.Chapter_17_2;

/**
 * @auther liyuhang
 * @date 2020/3/1 17:04
 * pair： 对
 * 键值对类体
 */
public class Pair<K, V> {
    public final K key;
    public final V value;
    public Pair(K k, V v){
        key = k;
        value = v;
    }
}
