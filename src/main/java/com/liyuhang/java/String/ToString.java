package com.liyuhang.java.String;

public class ToString
{
    public static void main(String[] args)
    {
        System.out.println(new Stringtest("6666666"));
    }
}


class Stringtest
{
    private String param;

    public Stringtest(String str)
    {
        // TODO Auto-generated constructor stub
        param = str;
    }

    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return param;
    }
}
