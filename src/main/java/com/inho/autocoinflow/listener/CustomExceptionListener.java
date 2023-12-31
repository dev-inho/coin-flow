package com.inho.autocoinflow.listener;

import com.inho.autocoinflow.event.CustomExceptionEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomExceptionListener {

    @EventListener
    public void onCustomException(CustomExceptionEvent event) {
        RuntimeException customException = event.getRuntimeException();

        /* TODO slac으로 메세지 발송 */
    }
}
