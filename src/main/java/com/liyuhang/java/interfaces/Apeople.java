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


class Afather
{
    public void speakChinese()
    {
        // TODO Auto-generated method stub

    }
}


class Ababy extends Afather implements Teacher, Chinese
{
    /*
     * //若继承的父类中与实现接口中的方法重名，则子类非必复写接口方法
     * @Override public void speakChinese() { // TODO Auto-generated method stub
     * super.speakChinese(); }
     */

    @Override
    public void sameMethodTest()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void teaching()
    {
        // TODO Auto-generated method stub

    }
}
