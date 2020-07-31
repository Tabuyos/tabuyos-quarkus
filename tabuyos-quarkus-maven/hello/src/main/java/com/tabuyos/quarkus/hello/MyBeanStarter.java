package com.tabuyos.quarkus.hello;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

/**
 * @Author Tabuyos
 * @Time 2020/7/30 14:00
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@Dependent
public class MyBeanStarter {

    void startup(@Observes StartupEvent event, AmazingService amazing, CoolService cool) {
        // call toString() function to enforce instance for CoolService, because the CoolService is normal scoped bean
        System.out.println(cool.toString());
    }
}
