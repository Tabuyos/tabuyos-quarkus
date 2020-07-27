package com.tabuyos.quarkus.start;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * @Author Tabuyos
 * @Time 2020/7/26 21:13
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@QuarkusMain
public class Start {

    /**
     * start application with main
     * hipnoteFixme It's DON'T work in gradle build tools, but work in maven
     * because: get rootModel of Model in loadWorkspace(BootstrapMavenContext ctx) in io.quarkus.bootstrap.resolver.maven
     * .workspace.LocalProject(line 93)
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
