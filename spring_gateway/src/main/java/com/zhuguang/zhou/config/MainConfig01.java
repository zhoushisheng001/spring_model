package com.zhuguang.zhou.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainConfig01 {

     @Value("${server.port}")
     private String port;

     @Value("${foo}")
     private String foo;


    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "MainConfig01{" +
                "port='" + port + '\'' +
                ", foo='" + foo + '\'' +
                '}';
    }
}
