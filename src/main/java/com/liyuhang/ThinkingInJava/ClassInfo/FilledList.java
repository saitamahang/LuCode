package com.liyuhang.ThinkingInJava.ClassInfo;


import java.util.ArrayList;
import java.util.List;


/**
 * 泛型Test
 * 
 * @author LiYuHang
 * @date 2018年12月30日
 */
public class FilledList<T>
{
    private Class<T> type;

    public FilledList(Class<T> type)
    {
        this.type = type;
    }

    public List<T> create(int nE)
    {
        List<T> result = new ArrayList<T>();
        try
        {
            for (int i = 0; i < nE; i++ )
            {
                result.add(type.newInstance());
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
        return result;
    }

    public static void main(String[] args)
    {
        FilledList<CountedInteger> countedInteger = new FilledList<CountedInteger>(
            CountedInteger.class);
        System.out.println(countedInteger.create(15));
    }
}


class CountedInteger
{
    private static long counter;

    private final long id = counter++ ;

    public String toString()
    {
        return Long.toString(id);
    };
}
