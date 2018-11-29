package com.liyuhang.java.InnerClass;

public class parcel10
{
    public Destination destination(String dest, float price)
    {
        return new Destination()
        {
            private int cost;
            // cost = Math.random();//这里是类体中，不能写赋值操作
            {
                // 这里是内部类的构造
                cost = Math.round(price);
                if (cost > 100)
                {
                    System.out.println("Over bg");
                }
            }

            private String label = dest;

            public String readLabel()
            {
                return label;
            }
        };
    }

    public static void main(String[] args)
    {
        parcel10 p10 = new parcel10();
        Destination d = p10.destination("lalalal", 101.395F);
        System.out.println(p10.destination("5464", 555.66F).readLabel());
    }
}


interface Destination
{
    abstract String readLabel();
}
