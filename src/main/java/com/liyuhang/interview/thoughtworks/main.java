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
        try
        {
            graph.search("B", "B");
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //graph.searchBaseDistance("C", "C", "", 30);
        graph.getRouteList();
        System.out.println(graph.getRouteList());
    }
}
