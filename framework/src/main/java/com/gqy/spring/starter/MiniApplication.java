package com.gqy.spring.starter;

import com.gqy.spring.core.ClassScanner;
import com.gqy.spring.web.server.TomcatServer;
import org.apache.catalina.LifecycleException;

import java.util.List;

public class MiniApplication {
    public static void run(Class<?> cls,String[] args) {
        System.out.println("hello,mini");
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            tomcatServer.startServer();
            List<Class<?>> classList = ClassScanner.scanClasses(cls.getPackage().getName());
            classList.forEach(i -> System.out.println(i.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
