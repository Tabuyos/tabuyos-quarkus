package com.tabuyos.quarkus.start;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * @Author Tabuyos
 * @Time 2020/7/29 17:30
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description The bean is normal scoped bean.
 */
@ApplicationScoped
public class CoolService {

    public CoolService() {
        System.out.println("cool service");
    }

    String ping() {
        return "hello";
    }

    void startup(@Observes StartupEvent event) {
        System.out.println("hell event");
    }
}
