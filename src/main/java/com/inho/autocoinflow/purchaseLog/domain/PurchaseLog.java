package com.inho.autocoinflow.purchaseLog.domain;

import com.inho.autocoinflow.common.domain.BaseEntity;
import lombok.ToString;

/**
 * 매입
 */
@ToString(callSuper = true)
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
