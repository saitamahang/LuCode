/**
 * 
 */
package com.liyuhang.java.RTTI;


import java.util.ArrayList;
import java.util.List;


/**
 * 初级工厂类练习
 * 
 * @author LiYuHang
 * @date 2019年1月22日
 */
public class FactoryTest
{
    static
    {
        // new son1.Factory();
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        for (Factory<? extends foo> factory : new foo().sonArray)
        {
            System.out.println(factory.create());
        }
        /*
         * output: son1
         */

        // System.out.println(new foo().sonArray);

        // System.out.println(new son1.Factory().create());
        /*
         * output: son1
         */
    }
}


class foo
{
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }

    static List<Factory<? extends foo>> sonArray = new ArrayList<Factory<? extends foo>>();

    static
    {
        sonArray.add(new son1.Factory());
    }
}


class son1 extends foo
{
    public static class Factory implements com.liyuhang.java.RTTI.Factory<son1>
    {
        public son1 create()
        {
            return new son1();
        }
    }
}
