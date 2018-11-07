package com.liyuhang.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * @author LiYuHang
 * @since 2018/09/04
 */
@Path("SprService")
public class SprService
{
    @GET
    @Path("test")
    public void test()
    {
        System.out.println("git commit test");
        System.out.println("++++++++++++++test++++++++++++++++");
    }
}
