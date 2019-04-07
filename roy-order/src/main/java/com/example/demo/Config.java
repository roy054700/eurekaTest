package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  //生命配置累
public class Config {

    @Bean
    @LoadBalanced  //负载均衡策略
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
