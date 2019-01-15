/**
 * 
 */
package liyuhang.java.RTTI;


import java.util.HashMap;


/**
 * 递归统计类型信息 
 * (继承HashMap,调用自身get(),put(),entryset())
 * 
 * @author LiYuHang
 * @date 2019年1月15日
 */
public class TypeCounter extends HashMap<Class<?>, Integer>
{

    private Class<?> baseType;
    /**
     * 构造
     */
    public TypeCounter(Class<?> baseType)
    {
        // TODO Auto-generated constructor stub
        this.baseType = baseType;
    }
}
