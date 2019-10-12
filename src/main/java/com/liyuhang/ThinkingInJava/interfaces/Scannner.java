package com.liyuhang.ThinkingInJava.interfaces;


import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;


/**
 * 接口 适配器模式测试类
 * 
 * @author LiYuHang
 */
public class Scannner
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble())
        {
            System.out.println(s.hasNextDouble() + "");
        }
    }
}


/**
 * 适配器 AdaptedRandomDoubles实现Readable接口，适配Scanner
 * 
 * @author LiYuHang
 */
class AdaptedRandomDoubles implements Readable
{

    private static Random rand = new Random(47);

    private int count;

    public double next()
    {
        return rand.nextDouble();
    }

    public AdaptedRandomDoubles(int count)
    {
        // TODO Auto-generated constructor stub
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb)
        throws IOException
    {
        // TODO Auto-generated method stub
        if (count-- == 0)
        {
            return -1;
        }
        String result = Double.toString(next()) + "";
        cb.append(result);// ???此处cb为空
        System.out.println(result + " ============= " + cb);
        return result.length();
    }

}
// out rsult:
//
// 0.7271157860730044 =============
// 0.5309454508634242 =============
// 0.16020656493302599 =============
// 0.18847866977771732 =============
// 0.5166020801268457 =============
// 0.2678662084200585 =============
// 0.2613610344283964 =============