/**
 * 
 */
package com.liyuhang.java.RTTI;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * @author LiYuHang
 * @date 2019年1月24日
 */
public class ReflectTest
{
    public static void main(String[] args)
        throws Exception
    {
        Class<?> clazz = Class.forName(args[0]);

        Method[] methods = clazz.getMethods();
        for (Method method : methods)
        {
            System.out.println(method.toString());
        }

        Constructor[] cons = clazz.getConstructors();
        for (Constructor constructor : cons)
        {
            System.out.println(constructor.toString());
        }
    }
}
