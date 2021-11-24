package com.lilili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author LiYuan
 * @Date 2021/6/29
 **/
@SpringBootApplication
public class GatewayPredicateApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayPredicateApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoute(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/get")
//                        .filters(f -> f
//                                .addRequestHeader("Hello", "World"))
//                        .uri("http://httpbin.org:80"))
//                .build();
//    }
}
