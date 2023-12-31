package com.inho.autocoinflow.common.exception;

/**
 * secret key를 찾지 못한 경우
 */
public class NotFoundSecretKey extends RuntimeException {

    private static final String errorMessage = "secret key를 찾을 수 없습니다.";

    public NotFoundSecretKey() {
        super(errorMessage);
    }

    public NotFoundSecretKey(String errorMessage) {
        super(errorMessage);
    }

    public NotFoundSecretKey(Throwable cause) {
        super(cause);
    }

    public NotFoundSecretKey(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

}
