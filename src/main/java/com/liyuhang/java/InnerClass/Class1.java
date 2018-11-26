package com.liyuhang.java.InnerClass;

/**
 * 外部类
 * 
 * @author LiYuHang
 */
public class Class1
{
    private String ClassName = "Class1";

    /**
     * 内部类
     * 
     * @author LiYuHang
     */
    public class inner
    {
        public void innerMethod()
        {
            // 内部类可以使用外围类的所有元素 ClassName
            System.out.println("This is innerMethod() and outside Class name is : " + ClassName);
        }

        /**
         * 生成外部类的引用
         * 
         * @return Class1
         */
        public Class1 out()
        {
            return Class1.this;
        }
    }

    public static void main(String[] args)
    {
        Class1 C1 = new Class1();
        // 创建内部类
        Class1.inner C1i = C1.new inner();
        C1i.innerMethod();
    }
}
