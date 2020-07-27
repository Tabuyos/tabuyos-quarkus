package com.tabuyos.quarkus.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author Tabuyos
 * @Time 2020/7/26 1:41
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello tabuyos";
    }
}
