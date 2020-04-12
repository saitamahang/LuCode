package com.liyuhang.ThinkingInJava.Generic;

import com.liyuhang.ThinkingInJava.Generic.Model.Orange;

/**
 * @auther liyuhang
 * @date 2019/12/3 15:30
 */
public class Holder<T> {
    private T value;

    public Holder() { }

    /**
     * Holer构造器接受 T 类型
     * @param val
     */
    public Holder(T val){
        this.value = val;
    }

    /**
     * set方法接受 T 类型
     * @param val
     */
    public void set(T val){
        this.value = val;
    }

    /**
     * get方法接受 T 类型
     * @return
     */
    public T get(){
        return value;
    }

    /**
     * 只有equals接受 Object
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
        Apple d = appleHolder.get();
        appleHolder.set(d);

        //会报Cannot upcast 这样是无法向上转型的
        //Holder<Fruit> fruitHolder = appleHolder;

        // 使用 ? extends Fruit 类型 appleHolder 则可以向上转型
        Holder<? extends Fruit> fruitHolder = appleHolder;
        Fruit p = fruitHolder.get();
        d = (Apple)fruitHolder.get();// 此处需要强制类型转换

        try {
            // 此处强制将实际为Apple的类型转换为Orange,会抛出ClassCastException
            // 此处在java 5 不会编译异常,但是在java8 下会编译异常，说明java8对此作了改进
            // Orange c = (Orange)fruitHolder.get();
        } catch (Exception e) {
            System.out.println(fruitHolder.equals(d));
        }
    }
}
