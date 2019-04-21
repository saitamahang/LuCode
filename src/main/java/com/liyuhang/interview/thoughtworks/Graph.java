/**
 * 
 */
package com.liyuhang.interview.thoughtworks;

import java.util.ArrayList;
import java.util.List;


/**
 * 单例地图类
 * 
 * @author LiYuHang
 * @date 2019年4月21日
 */
public class Graph
{

    /**
     * 私有构造
     */
    private Graph()
    {
    }

    private static Graph graph;

    public static Graph getInstance()
    {
        if (graph == null)
        {
            return new Graph();
        }
        return graph;
    }

    public static int[][] mapData = {
        {0, 5, 0, 5, 7},
        {0, 0, 4, 0, 0},
        {0, 0, 0, 8, 2},
        {0, 0, 8, 0, 6},
        {0, 3, 0, 0, 0}
};

    private static String[] locations = {"A", "B", "C", "D", "E"};

    private List<Route> routeList = new ArrayList<Route>();

    /**
     * @return the routeList
     */
    public List<Route> getRouteList()
    {
        return routeList;
    }

    /**
     * @param routeList
     *            the routeList to set
     */
    public void setRouteList(List<Route> routeList)
    {
        this.routeList = routeList;
    }

    /**
     * 计算入参路线的距离
     * 
     * @param route
     *            路线
     * @return distance
     */
    public int clcuDistance(String route)
    {
        String location[] = route.split("-");
        int distance = 0;
        for (int i = 0; i < location.length - 1; i++ )
        {
            int indexX = getIndex(location[i]);
            int indexY = getIndex(location[i + 1]);
            distance += mapData[indexX][indexY];
        }
        return distance;
    }

    public void search(String startPoint, String endPoint, String path)
    {
        StringBuilder copyPath = new StringBuilder(path.toString());
        if (copyPath.length() > 0 && copyPath.substring(copyPath.length() - 1).equals(endPoint))
        {
            return;
        }
        for (int i = 0; i < locations.length; i++ )
        {
            if (mapData[getIndex(startPoint)][i] == 0)
            {
                continue;
            }
            copyPath.append(startPoint);
            System.out.println(copyPath);
            if(locations[i].equals(endPoint))
            {
                Route route = new Route();
                route.setPath(copyPath.toString());
                routeList.add(route);
                return;
            }
            search(locations[i], endPoint, copyPath.toString());
        }
        return;
    }

    public void search(String startPoint, String endPoint)
    {
        search(startPoint, endPoint, "");
    }

    public static void showVersion()
    {
        System.out.println("version 1.0");
    };

    private static int getIndex(String ch)
    {
        for (int i = 0; i < locations.length; i++ )
        {
            if (locations[i] == ch)
            {
                return i;
            }
        }
        return -1;
    }
}
