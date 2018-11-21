package com.liyuhang.java.interfaces;

public class Apeople implements Teacher, Chinese, Worker
{

    @Override
    public void working()
    {
        System.out.println("Apeople working");
    }

    @Override
    public void speakChinese()
    {
        System.out.println("Apeople speakChinese");

    }

    @Override
    public void teaching()
    {
        System.out.println("Apeople teaching");

    }

    @Override
    public void sameMethodTest()
    {
        System.out.println("Apeople method");

    }

    public static void main(String[] args)
    {
        Apeople ap = new Apeople();
        Chinese ch = ap;
        Chinese chc = new Achild();
        ch.sameMethodTest();
        chc.sameMethodTest();
    }
}


class Achild implements Chinese
{
    @Override
    public void speakChinese()
    {

    }

    @Override
    public void sameMethodTest()
    {
        System.out.println("Achild method");

    }
}
