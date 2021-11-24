package com.lilili.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiYuan
 * @Date 2021/6/23
 **/
@RestController
@RefreshScope
public class CallController {

    @Value("${name}")
    private String name;

    @GetMapping("/hi")
    public String hi() {
        return name;
    }

}
