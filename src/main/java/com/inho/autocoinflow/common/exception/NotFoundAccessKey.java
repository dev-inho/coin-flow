package com.inho.autocoinflow.common.exception;

/**
 * Access key를 찾지 못한 경우
 */
public class NotFoundAccessKey extends RuntimeException {

    private static final String errorMessage = "access key를 찾을 수 없습니다.";

    public NotFoundAccessKey() {
        super(errorMessage);
    }

    public NotFoundAccessKey(String errorMessage) {
        super(errorMessage);
    }

    public NotFoundAccessKey(Throwable cause) {
        super(cause);
    }

    public NotFoundAccessKey(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

}
