package com.liyuhang.java.Hash;


import java.util.HashMap;


public class test
{
    public static void main(String[] args)
    {

        People p1 = new People("lyh", 88);
        System.out.println(p1.hashCode());

        HashMap<People, Integer> hashMap = new HashMap<People, Integer>();
        hashMap.put(p1, 1);

        System.out.println(hashMap.get(new People("小鸡鸡", 12)));
    }
}


class People
{
    private String name;

    private int age;

    public People(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        return this.name.equals(((People)obj).name) && this.age == ((People)obj).age;
    }
}
