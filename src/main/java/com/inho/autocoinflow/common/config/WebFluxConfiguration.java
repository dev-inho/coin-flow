package com.inho.autocoinflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;

/**
 * UpBit 설정
 **/
@Configuration
public class WebFluxConfiguration {

    /**
     * 업비트 API용 WebClient
     * @return
     */
    @Bean
    public WebClient webClientOfUpBitAPI() {
        /* UpBit 연결 */
        return WebClient.builder()
                .baseUrl("")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE+ ";charset=UTF-8")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create()
                        .responseTimeout(Duration.ofSeconds(10))
                ))
                .build();
    }

    /**
     * Slack용 WebClient
     * @return
     */
    @Bean
    public WebClient webClientOfSlackAPI() {
        /* TODO Slack 연결 */

        return WebClient.builder()
                .baseUrl("")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE+ ";charset=UTF-8")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create()
                        .responseTimeout(Duration.ofSeconds(10))
                ))
                .build();
    }

    /**
     * 카카오톡 API용 WebClient
     * @return
     */
    @Bean
    public WebClient webClientOfKakaoTalkAPI() {
        /* TODO 카카오톡 연결 */

        return WebClient.builder()
                .baseUrl("")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE+ ";charset=UTF-8")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create()
                        .responseTimeout(Duration.ofSeconds(10))
                ))
                .build();
    }

}
