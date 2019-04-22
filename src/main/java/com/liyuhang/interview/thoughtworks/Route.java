/**
 * 
 */
package com.liyuhang.interview.thoughtworks;

/**
 * Route related class
 * @author LiYuHang
 * @date 2019年4月21日
 */
public class Route implements Comparable<Route>
{
    /**
     * route
     */
    private String path;
    
    /**
     * distance
     */
    private String distance;

    /**
     * @return the path
     */
    public String getPath()
    {
        return path;
    }

    /**
     * @param path
     *            the path to set
     */
    public void setPath(String path)
    {
        this.path = path;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return this.path;
    }

    public String getDistance()
    {
        return distance;
    }

    public void setDistance(String distance)
    {
        this.distance = distance;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Route o)
    {
        // TODO Auto-generated method stub

        return Integer.parseInt(this.distance)
               - (o.getDistance().isEmpty() ? 0 : Integer.parseInt(o.getDistance()));
    }

}
