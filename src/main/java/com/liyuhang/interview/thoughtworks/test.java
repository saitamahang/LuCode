/**
 * 
 */
package com.liyuhang.interview.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiYuHang
 * @date 2019年4月22日
 */
public class test
{
    public static final int ONESTEP = 2;
    
    public static int[][] mapData = {
        {0, 5, 0, 5, 7}, 
        {0, 0, 4, 0, 0}, 
        {0, 0, 0, 8, 2},
        {0, 0, 8, 0, 6}, 
        {0, 3, 0, 0, 0}
        };

    private static String[] locations = {"A", "B", "C", "D", "E"};
    
    private static List<Route> routeList = new ArrayList<Route>();
    
    private List<String> historyRoute = new ArrayList<String>();
    
    public static void main(String[] args)
    {
        /*test.method("C", "C", "");
        System.out.println(routeList);*/
        
        String aaa[] = {"A", "B"};
        System.out.println(new String());
        
    }
    
    public static void method(String start, String end, final String beforePath)
    {
        for (int i = 0; i < locations.length; i++ )
        {
            String nextPoint = locations[i];
            // 路线是否存在，不存在，尝试下一条
            if(mapData[getIndex(start)][i] == 0)
            {
                continue;
            }
            // 路线是否回退 ，若回退，尝试下一条
            if(beforePath.length() > ONESTEP && comeBack(start, nextPoint, beforePath))
            {
                continue;
            }
            StringBuilder path = new StringBuilder(beforePath.toString());
            path = path.toString().isEmpty() ? path.append(start) : path;
            path.append(nextPoint);
            if(nextPoint.equals(end))
            {
                Route route = new Route();
                route.setPath(path.toString());
                routeList.add(route);
                continue;
            }
            method(locations[i], end, path.toString());
        }
    }

    /**
     * @param start
     * @param i
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
