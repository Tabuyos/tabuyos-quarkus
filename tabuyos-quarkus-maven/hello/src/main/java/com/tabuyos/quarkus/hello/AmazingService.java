package com.tabuyos.quarkus.hello;

import javax.inject.Singleton;

/**
 * @Author Tabuyos
 * @Time 2020/7/29 17:30
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@Singleton
public class AmazingService {

    public AmazingService() {
        System.out.println("amaze service");
    }

    String ping() {
        return "tabuyos";
    }
}
