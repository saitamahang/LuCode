package com.liyuhang.java.interfaces;

interface CanFight
{
    void fight();
}


interface CanSwim
{
    void swim();
}


interface CanFly
{
    void fly();
}


class ActionCharater
{
    public void fight()
    {}
}


class Hero extends ActionCharater implements CanFight, CanSwim, CanFly
{

    @Override
    public void fly()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void swim()
    {
        // TODO Auto-generated method stub

    }

}


public class Aimpl
{
    public static void t(CanFight x)
    {
        x.fight();
    }

    public static void u(CanSwim x)
    {
        x.swim();
    }

    public static void v(CanFly x)
    {
        x.fly();
    }

    public static void w(ActionCharater x)
    {
        x.fight();
    }

    public static void main(String[] args)
    {
        Hero h = new Hero();
        // java自动向上转型
        t(h);
        u(h);
        v(h);
        w(h);

        System.out.println(Chinese.CHINESEPEOPLE + " & " + Chinese.CHINANAME);
    }
}
