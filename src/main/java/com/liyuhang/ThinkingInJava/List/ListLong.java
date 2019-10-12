package com.liyuhang.ThinkingInJava.List;


import java.util.Arrays;
import java.util.List;


/**
 * test List long
 * 
 * @author LiYuHang
 */
public class ListLong
{
    public static long outLong(Long array)
    {
        Long bbb = null;
        List<Long> arrs = Arrays.asList(array);
        for (int i = 0; i < array.SIZE; i++ )
        {
            arrs.remove(arrs.get(i));
            System.out.println(i + " [output] : " + multiplyResult(arrs));
        }
        return 0L;
    }

    public static long multiplyResult(List<Long> arrs)
    {
        long result = 0;
        while (arrs.iterator().hasNext())
        {
            result *= arrs.iterator().next();
        }
        return result;
    }

    public static void main(String[] args)
    {
        long aaa[] = {1L, 2L, 3L, 4L};
        long result = 0;
        for (int i = 0; i < aaa.length; i++ )
        {}
    }
}
