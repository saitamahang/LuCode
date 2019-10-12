package com.liyuhang.ThinkingInJava.String;


import java.util.ArrayList;
import java.util.List;


/**
 * 无限递归调用
 * 
 * @author LiYuHang
 * @date 2018年12月27日
 */
public class InfiniterRecursion
{
    @Override
    public String toString()
    {
        // 无限递归调用
        // "===============" + this + "+++++++++++";
        return "===============" + super.toString() + "+++++++++++";
    }

    public static void main(String[] args)
    {
        List<InfiniterRecursion> iinR = new ArrayList<InfiniterRecursion>();
        for (int i = 0; i < 1; i++ )
        {
            iinR.add(new InfiniterRecursion());
        }

        System.out.println(iinR);
    }
}
