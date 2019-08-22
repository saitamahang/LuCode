/**
 * 
 */
package com.liyuhang.interview.thoughtworks;

import java.util.ArrayList;
import java.util.List;


/**
 * Map related class
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
    
    public static final int ONESTEP = 2;

    /**
     * 坐标数据
     */
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
    private static String calcuDistance(String route) throws Exception
    {
        char[] points = route.toCharArray();
        int distance = 0;
        for (int i = 0; i < points.length - 1; i++ )
        {
            int indexX = getIndex(String.valueOf(points[i]));
            int indexY = getIndex(String.valueOf(points[i + 1]));
            if (indexX<0 || indexY<0)
            {
                return "NO SUCH ROUTE";
            }
            if(mapData[indexX][indexY] == 0)
            {
                return "NO SUCH ROUTE";
            }
            distance += mapData[indexX][indexY];
        }
        return Integer.toString(distance);
    }
    
    /**
     * 获取路线的距离
     * @param route 路线
     * @return 距离
     * @throws Exception
     */
    public static String getDistance(String route) throws Exception{
        String location[] = route.split("-");
        route = getString(location); 
        return calcuDistance(route);
    }

    /**
     * 寻找所有可能路线（路线不回退）
     * @param startPoint 起点
     * @param endPoint 终点
     * @param beforePath 已经走过的地点路线
     */
    public void search(String startPoint, String endPoint, String beforePath)
        throws Exception
    {
        for (int i = 0; i < locations.length; i++ )
        {
            String nextPoint = locations[i];
            // 路线是否存在，不存在，尝试下一条
            if(mapData[getIndex(startPoint)][i] == 0)
            {
                continue;
            }
            // 路线是否回退 ，若回退，尝试下一条
            if(beforePath.length() > ONESTEP && comeBack(startPoint, nextPoint, beforePath))
            {
                continue;
            }
            StringBuilder path = new StringBuilder(beforePath.toString());
            path = path.toString().isEmpty() ? path.append(startPoint) : path;
            path.append(nextPoint);
            if(nextPoint.equals(endPoint))
            {
                Route route = new Route();
                route.setPath(path.toString());
                route.setDistance(calcuDistance(path.toString()));
                routeList.add(route);
                continue;
            }
            search(nextPoint, endPoint, path.toString());
        }
    }
    
    /**
     * 寻找所有距离小于指定大小的路线(路线会回退)
     * @param startPoint 起点
     * @param endPoint 终点
     * @param beforePath 已经走过的地点路线
     * @param distance 设定最长距离
     * @throws Exception 异常
     */
    public void searchBaseDistance(String startPoint, String endPoint, String beforePath, int distance) throws Exception
    {
        for (int i = 0; i < locations.length; i++ )
        {
            String nextPoint = locations[i];
            // 路线是否存在，不存在，尝试下一条
            if(mapData[getIndex(startPoint)][i] == 0)
            {
                continue;
            }
            
            StringBuilder path = new StringBuilder(beforePath.toString());
            path = path.toString().isEmpty() ? path.append(startPoint) : path;
            path.append(nextPoint);
            if(nextPoint.equals(endPoint))
            {
                // 超过距离参数，停止递归。
                if(Integer.parseInt(calcuDistance(path.toString())) >= distance)
                {
                    return;
                }
                Route route = new Route();
                route.setPath(path.toString());
                route.setDistance(calcuDistance(path.toString()));
                routeList.add(route);
            }
            searchBaseDistance(nextPoint, endPoint, path.toString(), distance);
        }
    }

    /**
     * 寻找所有可能路线（路线不回退）
     * @param startPoint 起点
     * @param endPoint 终点
     */
    public void search(String startPoint, String endPoint)
        throws Exception
    {
        search(startPoint, endPoint, "");
    }
    
    /**
     * 这一步是否是回退
     * @param start 起点
     * @param nextPoint 下一个地点
     * @param beforPath 已经走过的地点路线
     * @return 是否
     */
    private static boolean comeBack(String start, String nextPoint, String beforPath)
    {
        String comeBackRoute = nextPoint + start;
        if(beforPath.contains(comeBackRoute))
        {
            return true;
        }
        return false;
    }
    
    /**
     * 根据地点，获取地图中的下标
     * @param ch 地点
     * @return 地点下标
     */
    private static int getIndex(String ch)
    {
        for (int i = 0; i < locations.length; i++ )
        {
            if (locations[i].equals(ch))
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 获取字符串
     * 
     * @param str
     *            字符数组
     * @return string
     */
    private static String getString(String[] str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++ )
        {
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
