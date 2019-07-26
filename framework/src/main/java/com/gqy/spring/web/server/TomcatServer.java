package com.gqy.spring.web.server;

import com.gqy.spring.web.servlet.DisPatcherServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer {
    private Tomcat tomcat;
    private String[] args;

    public TomcatServer(String[] args) {
        this.args = args;
    }

    public void startServer() throws LifecycleException {
        tomcat = new Tomcat();
        tomcat.setPort(6699);
        tomcat.start();

        Context context = new StandardContext();
        context.setPath("");
        //声明周期监听器
        context.addLifecycleListener(new Tomcat.FixContextListener());
        DisPatcherServlet servlet = new DisPatcherServlet();

        Tomcat.addServlet(context,"dispatcherServlet",servlet).setAsyncSupported(true);
        context.addServletMappingDecoded("/","dispatcherServlet");
        //注册host 容器
        tomcat.getHost().addChild(context);

        Thread awaitThread = new Thread("tomcat_await_thread"){
            @Override
            public void run() {
                TomcatServer.this.tomcat.getServer().await();
            }
        };
        awaitThread.setDaemon(false);
        awaitThread.start();
    }

}
