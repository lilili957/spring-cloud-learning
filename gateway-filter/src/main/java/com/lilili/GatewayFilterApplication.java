package com.lilili;

import com.lilili.filter.NameFilter;
import com.lilili.filter.RequestTimeGatewayFilterFactory;
import com.lilili.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author LiYuan
 * @Date 2021/6/30
 **/
@SpringBootApplication
public class GatewayFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayFilterApplication.class, args);
    }

    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    @Bean
    public NameFilter nameFilter() {
        return new NameFilter();
    }
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/customer/**")
//                .filters(f -> f.filter(new RequestTimeFilter() )))
//    }

}
