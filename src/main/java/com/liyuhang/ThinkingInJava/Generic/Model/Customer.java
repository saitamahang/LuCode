package com.liyuhang.ThinkingInJava.Generic.Model;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;

public class Customer {
    private static long counter = 1;
    private final long id = counter++;

    /**
     * 私有构造，使得外部只能调用Generator
     */
    private  Customer () {}

    public String toString(){
        return  "Customer" + id;
    }
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
