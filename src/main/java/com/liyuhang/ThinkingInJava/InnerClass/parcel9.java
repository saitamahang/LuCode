package com.liyuhang.ThinkingInJava.InnerClass;

/**
 * 内部匿名类
 * 
 * @author LiYuHang
 */
public class parcel9
{
    public static Base getBase(int i)// 此处的变量无需用final修饰，
    {
        // 内部匿名类
        return new Base(i)
        {
            {
                System.out.println("匿名类构造");
            }

            // 重写父类抽象方法
            @Override
            public void function()
            {
                System.out.println("................");
            }
        };
    }

    public static Base1 getBase1(String NUM)
    {
        return new Base1()
        {
            private String dest = NUM;

            public void test()
            {
                System.out.println("print Base1 : " + dest);
            }
        };
    }

    public static void main(String[] args)
    {
        Base base = getBase(7);
        Base1 base1 = getBase1("Num");
        parcel9 p9 = new parcel9();
        p9.getBase1("1111111");
        base.function();
        base1.test();
    }
}


interface Base1
{
    void test();
}


abstract class Base
{
    public Base(int i)
    {
        System.out.println("Base constructor");
    }

    public abstract void function();
}
