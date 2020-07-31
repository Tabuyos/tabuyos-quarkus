package com.tabuyos.quarkus.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * @Author Tabuyos
 * @Time 2020/7/30 14:34
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/hello")
                .then()
                .statusCode(200)
                .body(is("hello tabuyos"));
    }

    @Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/api/hello/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + uuid));
    }
}
