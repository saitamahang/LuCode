/**
 * 
 */
package com.liyuhang.java.ClassInfo;

/**
 * 类型信息测试
 * 
 * @author LiYuHang
 * @date 2018年12月30日
 */
class Initable
{
    static final int staticFinal = 47;

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

        // 引用静态变量，似乎并不会使类内部的静态成员初始化
        // new 操作 、.forName才会初始化
        System.out.println(Initable.staticFinal);

        Class initab2 = Class.forName("com.liyuhang.java.ClassInfo.Initable2");
        test();
    }

    public static void test()
    {
        new Initable();
    }
}
