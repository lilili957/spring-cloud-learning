package com.lilili;

import com.lilili.config.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author LiYuan
 * @Date 2021/7/14
 **/
@SpringBootApplication
public class GatewayLimitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayLimitApplication.class, args);
    }

    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }
}
