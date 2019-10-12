/**
 * 
 */
package com.liyuhang.ThinkingInJava.RTTI;


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
            System.out.println("======================================================");
        Constructor[] cons = clazz.getConstructors();
        for (Constructor constructor : cons)
        {
            System.out.println(constructor.toString());
        }
    }

    /**
     * 外部命令运行：
     * 1. javac -d . ReflectTest.java 
     * 2. java com.liyuhang.java.RTTI.ReflectTest com.liyuhang.java.RTTI.ReflectTest
     * 
     * Output:
     *  public static void com.liyuhang.java.RTTI.ReflectTest.main(java.lang.String[]) throws java.lang.Exception
        public final void java.lang.Object.wait() throws java.lang.InterruptedException
        public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        public boolean java.lang.Object.equals(java.lang.Object)
        public java.lang.String java.lang.Object.toString()
        public native int java.lang.Object.hashCode()
        public final native java.lang.Class java.lang.Object.getClass()
        public final native void java.lang.Object.notify()
        public final native void java.lang.Object.notifyAll()
        ======================================================
        public com.liyuhang.java.RTTI.ReflectTest()
     */
}
