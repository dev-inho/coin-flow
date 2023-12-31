package com.inho.autocoinflow.purchaseLog;

import com.inho.autocoinflow.common.domain.BaseEntity;

/**
 * 매입
 */
public class PurchaseLog extends BaseEntity {

    /**
     * 매입 idx
     */
    private long idx;

    /**
     * 매매 내용
     */
    private String content;

    /**
     * 코인 명
     */
    private String coinName;

    /**
     * 코인가격
     */
    private long coinPrice;

}
