package com.inho.autocoinflow.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 로그 AOP
 */
@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.inho.autocoinflow.*.service.impl.*ServiceImpl.*(..))")
    private void serviceLayer() {}

    /**
     * 메서드 시작 전 로그 출력
     * @param joinPoint 메서드 실행 정보
     */
    @Before("serviceLayer()")
    public void logBefore(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        String argsString = Arrays.toString(args);

        logger.info("Before Method " + methodName + " is about to be called with arguments " + argsString);
    }

    @After("serviceLayer()")
    public void logAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        logger.info("After Method " + methodName);
    }

}
