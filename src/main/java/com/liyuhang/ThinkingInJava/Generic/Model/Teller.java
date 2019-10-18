package com.liyuhang.ThinkingInJava.Generic.Model;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;

public class Teller {
    private static long counter = 1;
    private final long id = counter++;

    /**
     * 私有化构造，使得外部只能调用Generator
     */
    private Teller() {}

    public String toString() {
        return "Teller" + id;
    }

    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}
