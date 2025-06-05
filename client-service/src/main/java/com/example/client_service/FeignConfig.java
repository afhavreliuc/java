package com.example.client_service;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public RequestInterceptor basicAuthRequestInterceptor() {
        return requestTemplate -> requestTemplate.header(
            "Authorization",
            "Basic " + java.util.Base64.getEncoder().encodeToString("user:password".getBytes())
        );
    }
} 