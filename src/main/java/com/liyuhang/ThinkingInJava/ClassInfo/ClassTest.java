/**
 * 
 */
package com.liyuhang.ThinkingInJava.ClassInfo;


import java.util.Random;


/**
 * 类型信息测试
 * 
 * @author LiYuHang
 * @date 2018年12月30日
 */
class Initable
{
    static Random random = new Random(1000);

    static final int staticFinal = 47;

    static final int staticFinal2 = random.nextInt(100);

    // static final int staticFinal =
    Initable()
    {
        System.out.println("initializing initable constructor");
    }

    static
    {
        System.out.println("initializing initable");
    }
}


class Initable1
{
    static final int staticFinal = 417;
    static
    {
        System.out.println("initializing initable1");
    }
}


class Initable2
{
    static final int staticFinal = 4117;
    static
    {
        System.out.println("initializing initable2");
    }
}


public class ClassTest
{
    public static void main(String[] args)
        throws Exception
    {
        Class initab = Initable.class;
        System.out.println("-----------------------   分割线    --------------------");
        System.out.println(".calss 不会初始化类内部静态成员");

        // 如果类引用“编译期常量”，并不会使类内部的静态成员初始化 eg:Initable.staticFinal
        // 如果只是将一个域设置为static final 则需要初始化这个类，所以静态成员也会初始化 eg:Initable.staticFinal2
        // new 操作 、.forName才会初始化
        System.out.println(Initable.staticFinal2);

        Class initab2 = Class.forName("com.liyuhang.ThinkingInJava.ClassInfo.Initable2");
        // test();
        // Class initabb = Class.forName("com.liyuhang.java.ClassInfo.Initable");
    }

    public static void test()
    {
        new Initable();
    }
}
