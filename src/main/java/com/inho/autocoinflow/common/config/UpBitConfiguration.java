package com.inho.autocoinflow.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.inho.autocoinflow.common.exception.NotFoundAccessKey;
import com.inho.autocoinflow.common.exception.NotFoundSecretKey;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.UUID;

@Configuration
@PropertySource("classpath:upbit-api.properties")
public class UpBitConfiguration {

    private Logger logger = LoggerFactory.getLogger(UpBitConfiguration.class);

    /**
     * UPBIT 비밀키
     */
    @Value("${upbit.secret-key}")
    private String secretKey;

    /**
     * UPBIT 허용키
     */
    @Value("${upbit.access-key}")
    private String accessKey;

    /**
     * UPBIT에 사용할 토큰 생성
     * @return
     */
    public String getUpBitToken() {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        String jwtToken = JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(algorithm);

        return "Bearer " + jwtToken;
    }

    /**
     * 비밀키, 암호키 체크
     */
    @PostConstruct
    private void init() {
        if (secretKey == null) throw new NotFoundSecretKey();
        if (accessKey == null) throw new NotFoundAccessKey();

        logger.info("================================================");
        logger.info("               secretKey : {}", secretKey);
        logger.info("               accessKey : {}", accessKey);
        logger.info("================================================");
    }

}
