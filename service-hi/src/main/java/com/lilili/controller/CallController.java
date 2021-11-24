package com.lilili.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author LiYuan
 * @Date 2021/6/28
 **/
@RestController
public class CallController {

    private static final Logger LOG = Logger.getLogger(CallController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hi")
    public String callHome() {
        LOG.log(Level.INFO, "calling trace service-hi");
        return restTemplate.getForObject("http://localhost:10005/hi", String.class);
    }

    @GetMapping("/info")
    public String info() {
        LOG.log(Level.INFO, "calling trace service-hi");
        return "I'm service-hi";
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
