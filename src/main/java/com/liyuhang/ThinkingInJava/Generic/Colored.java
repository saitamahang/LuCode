package com.liyuhang.ThinkingInJava.Generic;

/**
 * 泛型extends测试
 * @param <T>
 */
public class Colored<T extends HasColor> {
    T item;
    Colored(T item ){
        this.item = item;
    }
    T getItem(){
        return item;
    }
    java.awt.Color color(){
        return item.getColor();
    }
}

interface HasColor{
    java.awt.Color getColor();
}

class Dimension {public int x,y,z,w;}

/**
 * 返回两种不同类型
 * @param <T>
 */
class ColoredDimension<T extends Dimension & HasColor> {
    T item;
    ColoredDimension(T item){this.item = item;}
    T getItem(){return item;}
    // 返回两种不同类型
    java.awt.Color color(){return item.getColor();}
    int getX(){return item.x;}
    int getY(){return item.y;}
    int getZ(){return item.z;}
    int getW(){return item.w;}
}
//class Stringtest extends String {
//
//}
