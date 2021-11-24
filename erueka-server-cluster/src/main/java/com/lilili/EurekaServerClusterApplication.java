package com.lilili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author LiYuan
 * @Date 2021/6/29
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterApplication.class, args);
    }
}
