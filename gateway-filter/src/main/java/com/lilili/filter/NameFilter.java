package com.lilili.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author LiYuan
 * @Date 2021/6/30
 **/
public class NameFilter implements GlobalFilter, Ordered {

    private static final Log log = LogFactory.getLog(NameFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        Mono<Void> exchange1 = getVoidMono(exchange, name);
        if (exchange1 != null) {
            return exchange1;
        }
        return chain.filter(exchange);
    }

    private Mono<Void> getVoidMono(ServerWebExchange exchange, String name) {
        if (name == null || name.isEmpty()) {
            log.info("name is empty...");
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            return exchange.getResponse().setComplete();
        }
        return null;
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
