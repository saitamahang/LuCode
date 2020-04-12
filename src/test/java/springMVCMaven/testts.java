/**
 * 
 */
package springMVCMaven;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.liyuhang.interview.thoughtworks.Graph;
import com.liyuhang.interview.thoughtworks.Route;

/**
 * @author LiYuHang
 * @date 2019年4月22日
 */
public class testts
{
    
    Graph graph = Graph.getInstance();
    /**
     * 
     */
    @Test
    public void outPut1_5()
    {
        try
        {
            System.out.println("outPut 1-5 : ");
            String routrLength1 = Graph.getDistance("A-B-C");
            String routrLength2 = Graph.getDistance("A-D");
            String routrLength3 = Graph.getDistance("A-D-C");
            String routrLength4 = Graph.getDistance("A-E-B-C-D");
            String routrLength5 = Graph.getDistance("A-E-D");
            
            System.out.println(routrLength1);
            System.out.println(routrLength2);
            System.out.println(routrLength3);
            System.out.println(routrLength4);
            System.out.println(routrLength5);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    /**
     * The number of trips starting at C and ending at C with a maximum of 3 stops.  
     * In the sample data below, there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
     */
    @Test
    public void outPut6()
    {
        try
        {
            graph.search("C", "C");
            List<Route> routes = graph.getRouteList();
            int count = 0;
            for (Route route : routes)
            {
                if(route.getPath().length() <= 3 + 1)
                {
                    count+=1;
                }
            }
            System.out.println("outPut6 : " + count);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * The number of trips starting at A and ending at C with exactly 4 stops. In the sample data
     * below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via
     * D,E,B).
     */
    @Test
    public void outPut7()
    {
        try
        {
            graph.search("A", "C");
            List<Route> routes = graph.getRouteList();
            int count = 0;
            for (Route route : routes)
            {
                if (route.getPath().length() == 4 + 1)
                {
                    count += 1;
                }
            }
            System.out.println("outPut7 : " + count);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * The length of the shortest route (in terms of distance to travel) from A to C.
     */
    @Test
    public void outPut8()
    {
        try
        {
            graph.search("A", "C");
            List<Route> routes = graph.getRouteList();
            Route[] routeArr = new Route[routes.size()];
            for (int i = 0; i < routes.size(); i++ )
            {
                routeArr[i] = routes.get(i);
            }
            Arrays.sort(routeArr);
            System.out.println("outPut8 pathDetil");
            for (int i = 0; i < routeArr.length; i++ )
            {
                System.out.print(
                    "path = " + routeArr[i] + ",distance = " + routeArr[i].getDistance()
                                 + "  |  ");
            }
            System.out.println();
            System.out.println("outPut8 : " + routeArr[0].getDistance());
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * The length of the shortest route (in terms of distance to travel) from B to B.
     */
    @Test
    public void outPut9()
    {
        try
        {
            graph.search("B", "B");
            List<Route> routes = graph.getRouteList();
            Route[] routeArr = new Route[routes.size()];
            for (int i = 0; i < routes.size(); i++ )
            {
                routeArr[i] = routes.get(i);
            }
            Arrays.sort(routeArr);
            System.out.println("outPut9 pathDetil");
            for (int i = 0; i < routeArr.length; i++ )
            {
                System.out.print(
                    "path = " + routeArr[i] + ",distance = " + routeArr[i].getDistance()
                                 + "  |  ");
            }
            System.out.println();
            System.out.println("outPut9 : " + routeArr[0].getDistance());
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * The number of different routes from C to C with a distance of less than 30. In the sample
     * data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
     */
    @Test
    public void outPut10()
    {
        try
        {
            graph.searchBaseDistance("C", "C", "", 30);
            List<Route> routes = graph.getRouteList();
            Route[] routeArr = new Route[routes.size()];
            for (int i = 0; i < routes.size(); i++ )
            {
                routeArr[i] = routes.get(i);
            }
            Arrays.sort(routeArr);
            System.out.println("outPut10 pathDetil");
            for (int i = 0; i < routeArr.length; i++ )
            {
                System.out.print("path = " + routeArr[i] + ",distance = "
                                 + routeArr[i].getDistance() + "  |  ");
            }
            System.out.println();
            System.out.println("outPut10 : " + routeArr.length);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
