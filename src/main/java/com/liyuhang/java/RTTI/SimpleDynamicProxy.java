/**
 * 
 */
package com.liyuhang.java.RTTI;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * @author LiYuHang
 * @date 2019年1月28日
 */
public class SimpleDynamicProxy
{

}


class DynamicProxyHandler implements InvocationHandler
{

    /*
     * (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method,
     * java.lang.Object[])
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        // TODO Auto-generated method stub
        return null;
    }

}
