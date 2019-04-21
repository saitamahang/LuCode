/**
 * 
 */
package com.liyuhang.java.List;


import java.util.LinkedList;
import java.util.List;


/**
 * @author LiYuHang
 * @date 2019年4月18日
 */
public class listTest
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++ )
        {
            list.add(i);
        }

        for (int i = 0; i < 5; i++ )
        {
            list.remove(i);
        }

        System.out.println(list.toString());
    }
}
