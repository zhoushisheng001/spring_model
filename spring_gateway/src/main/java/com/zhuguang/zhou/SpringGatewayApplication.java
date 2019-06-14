package com.zhuguang.zhou;

import com.zhuguang.zhou.config.MainConfig01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringGatewayApplication.class, args);
        MainConfig01 bean = context.getBean(MainConfig01.class);
        System.out.println("bean info:" + bean);
    }

}
