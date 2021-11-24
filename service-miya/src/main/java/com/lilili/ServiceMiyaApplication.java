package com.lilili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author LiYuan
 * @Date 2021/6/28
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceMiyaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class, args);
    }
}
