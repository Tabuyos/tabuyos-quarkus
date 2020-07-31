package com.tabuyos.quarkus.hello;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * @Author Tabuyos
 * @Time 2020/7/29 10:10
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@QuarkusMain
public class Start {
    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
