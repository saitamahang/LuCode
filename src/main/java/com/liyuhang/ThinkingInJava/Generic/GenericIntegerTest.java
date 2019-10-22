package com.liyuhang.ThinkingInJava.Generic;

public class GenericIntegerTest {
    public static void main(String[] args) {
        ClassAsFactory<People> p = new ClassAsFactory<People>(People.class);
        System.out.println("ClassAsFactory<People> succeeded!");
        try {
            ClassAsFactory<Animal> a = new ClassAsFactory<Animal>(Animal.class);
            System.out.println("ClassAsFactory<Animal> succeeded!");
        } catch (Exception e){
            // 此处会走到异常分支，因为Animal没有默认(无参)构造
            System.out.println("ClassAsFactory<Animal> failed!");
        }

        //书上的例子是Integer
        try {
            ClassAsFactory<Integer> a = new ClassAsFactory<Integer>(Integer.class);
            System.out.println("ClassAsFactory<Integer> succeeded!");
        } catch (Exception e){
            // 此处会走到异常分支，因为Animal没有默认(无参)构造
            System.out.println("ClassAsFactory<Integer> failed!");
        }
    }
}

class ClassAsFactory<T>{
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
class People{}
class Animal{
    public final String animal;
    public Animal(String animal){
        this.animal = animal;
    }
}
