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
public class MiyaController {

    private static final Logger LOG = Logger.getLogger(MiyaController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hi")
    public String home() {
        LOG.log(Level.INFO, "hi is be called");
        return "Hi i'm Miya!";
    }

    @GetMapping("/info")
    public String info() {
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:10004/info", String.class);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
