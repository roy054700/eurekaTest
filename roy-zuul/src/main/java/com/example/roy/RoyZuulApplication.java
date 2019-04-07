package com.example.roy;

import com.example.roy.filter.AccessZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class RoyZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoyZuulApplication.class, args);
	}

	@Bean
    public AccessZuulFilter accessZuulFilter(){
	    return new AccessZuulFilter();
    }

}
