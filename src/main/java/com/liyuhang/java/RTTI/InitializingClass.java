/**
 * 
 */
package com.liyuhang.java.RTTI;


import java.util.Random;


/**
 * RTTI(Run-Time Type Information)： 运行期类型信息 <br> 类字面常量
 * 
 * @author LiYuHang
 * @date 2019年1月8日
 */

class Initable
{
    static final int staticFinal = 47;

    static final int staticFinal2 = InitializingClass.random.nextInt(1000);

    static
    {
        System.out.println("Initializing Initable");
    }
}


class Initable2
{
    static int staticNonFinal = 68;
    static
    {
        System.out.println("Initializing Initable2");
    }
}


class Initable3
{
    static int staticNonFinal = 96;
    static
    {
        System.out.println("Initializing Initable3");
    }
}


public class InitializingClass
{
    public static Random random = new Random();

    public static void main(String[] args)
        throws Exception
    {
        Class initable = Initable.class;
        System.out.println("=======  1  ======");
        System.out.println(Initable.staticFinal);
        System.out.println("=======  2  ======");
        System.out.println(Initable.staticFinal2);
        System.out.println("=======  3  ======");
        System.out.println(Initable2.staticNonFinal);
        System.out.println("=======  4  ======");
        Class initable3 = Class.forName("liyuhang.java.RTTI.Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
