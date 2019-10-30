package com.liyuhang.ThinkingInJava;

public class GenericArrayComplex<T> {
    private T[] array;
    public GenericArrayComplex(int sz){
        array  = (T[])new Object[sz];
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){ return array[index];}

    public  T[] rep (){ return array;}

    public static void main(String[] args) {
        GenericArrayComplex gai = new GenericArrayComplex<Integer>(10);
        Object[] oa = gai.rep();
    }
}
