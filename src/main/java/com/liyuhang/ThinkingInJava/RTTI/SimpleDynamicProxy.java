/**
 * 
 */
package com.liyuhang.ThinkingInJava.RTTI;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 动态代理简单实现
 * 
 * @author LiYuHang
 * @date 2019年1月28日
 */
class DynamicProxyHandler implements InvocationHandler
{
    private realObject obj = new realObject();

    /**
     * 代理处理器
     */
    public DynamicProxyHandler(realObject obj)
    {
        this.obj = obj;
        // TODO Auto-generated constructor stub
    }
    /*
     * (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method,
     * java.lang.Object[])
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        if (null != args)
        {
            for (Object org : args)
            {
                System.out.println("    " + org);
            }
        }

        System.out.println("================ 代理前 ==================");
        Object proxyyy = method.invoke(obj, args);
        System.out.println("================ 代理后 ==================");

        return proxyyy;
    }

}


public class SimpleDynamicProxy
{

    public static void main(String[] args)
    {
        ProxyInterface proxyInterface = (ProxyInterface)Proxy.newProxyInstance(
            ProxyInterface.class.getClassLoader(), new Class[] {ProxyInterface.class},
            new DynamicProxyHandler(new realObject()));

        proxyInterface.methodOne();
        proxyInterface.methodTwo();
    }

}


class realObject implements ProxyInterface
{

    @Override
    public void methodOne()
    {
        // TODO Auto-generated method stub
        System.out.println("This is method One!");
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.liyuhang.ThinkingInJava.RTTI.ProxyInterface#methodTwo()
     */
    @Override
    public void methodTwo()
    {
        // TODO Auto-generated method stub
        System.out.println("This is method Two!");
    }

}
