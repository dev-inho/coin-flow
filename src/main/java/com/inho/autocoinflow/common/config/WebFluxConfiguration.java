package com.inho.autocoinflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * UpBit 설정
 **/
@Configuration
public class WebFluxConfiguration {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE+ ";charset=UTF-8")
                .build();
    }

}
