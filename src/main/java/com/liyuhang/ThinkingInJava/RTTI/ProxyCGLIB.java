/**
 * 
 */
package com.liyuhang.ThinkingInJava.RTTI;


import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * @author LiYuHang
 * @date 2019年1月31日
 */
public class ProxyCGLIB
{
    public String sayHello()
    {
        return "say Hello";
    }
}


class MyMethodInterceptor implements MethodInterceptor
{

    /*
     * CGlib动态代理 1. 首先实现一个MethodInterceptor，方法调用会被转发到该类的intercept()方法。
     */
    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3)
        throws Throwable
    {
        // TODO Auto-generated method stub
        return null;
    }

}
