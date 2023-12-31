package com.inho.autocoinflow.tradeLog;

import com.inho.autocoinflow.common.domain.BaseEntity;

/**
 * 매매
 */
public class TradeLog extends BaseEntity {

    /**
     * 로그 번호
     */
    private long idx;

    /**
     * 매매 내용
     */
    private String content;

    /**
     * 코인명
     */
    private String coinName;

    /**
     * 코인 가격
     */
    private long coinPrice;

}
