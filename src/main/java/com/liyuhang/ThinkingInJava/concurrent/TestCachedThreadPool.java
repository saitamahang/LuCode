package com.liyuhang.ThinkingInJava.concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestCachedThreadPool
{
    public static void main(String[] args)
    {
        // ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++ )
        {
            executorService.execute(new TestRunnable());
            System.out.println("************* a" + i + " *************");
        }
        executorService.shutdown();
    }
}


class TestRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。");
        while (true)
        {
            try
            {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
