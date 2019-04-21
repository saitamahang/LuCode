/**
 * 
 */
package com.liyuhang.interview.thoughtworks;

/**
 * @author LiYuHang
 * @date 2019年4月22日
 */
public class main
{
    public static void main(String[] args)
    {
        Graph graph = Graph.getInstance();
        graph.search("A", "C");
        graph.getRouteList();
        System.out.println(graph.getRouteList());
    }
}
