package com.liyuhang.java.utiltest;


import java.util.Random;


/**
 * @author LiYuHang
 * @date 2019年1月7日
 */
public class RandomTest
{
    public static void main(String[] args)
    {
        Random _random = new Random();
        for (int i = 0; i < 100; i++ )
        {
            System.out.println(_random.nextInt(100));
        }

    }
}
