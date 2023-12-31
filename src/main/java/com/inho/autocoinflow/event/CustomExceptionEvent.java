package com.inho.autocoinflow.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 사용자 정의 에러 발생 이벤트
 */
@Getter
public class CustomExceptionEvent extends ApplicationEvent {

    private final RuntimeException runtimeException;

    public CustomExceptionEvent(Object source, RuntimeException customException) {
        super(source);
        this.runtimeException = customException;
    }

}
