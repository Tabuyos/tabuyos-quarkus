package com.tabuyos.quarkus.start;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author Tabuyos
 * @Time 2020/7/29 10:10
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@Path("/api")
public class TabuyosResource {

    @Inject
    AmazingService amazingService;

    @Inject
    CoolService coolService;

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "hello tabuyos";
    }

    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String tabuyos(@PathParam("name") String name) {
        return "hello " + name;
    }

    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public String ping() {
        return amazingService.ping() + coolService.ping();
    }
}