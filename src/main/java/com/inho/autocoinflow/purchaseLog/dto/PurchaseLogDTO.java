package com.inho.autocoinflow.purchaseLog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseLogDTO {

    /**
     * 매입 내용
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
