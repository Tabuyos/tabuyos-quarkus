package com.tabuyos.quarkus.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author Tabuyos
 * @Time 2020/7/29 10:20
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@Path("/")
public class IndexResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "index";
    }
}
