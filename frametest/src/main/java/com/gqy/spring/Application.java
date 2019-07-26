package com.gqy.spring;

import com.gqy.spring.starter.MiniApplication;

public class  Application {
    public static void main(String[] args) {
        System.out.println("Hello word,Application test");
        MiniApplication.run(Application.class,args);
    }
}
