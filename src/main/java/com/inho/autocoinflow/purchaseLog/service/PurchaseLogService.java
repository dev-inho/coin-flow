package com.inho.autocoinflow.purchaseLog.service;

import com.inho.autocoinflow.purchaseLog.domain.PurchaseLog;
import com.inho.autocoinflow.purchaseLog.dto.PurchaseLogDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface PurchaseLogService {

    /**
     * 로그 저장
     * @param content 매입 내용
     * @param coinName 매입 코인명
     * @param coinPrice 매입 코인 가격
     */
    void addPurchaseLog(String content, String coinName, long coinPrice);

    /**
     * 생성일을 기준으로 조회
     * @param fromDate 시작일
     * @param toDate 종료일
     * @return List<PurchaseLog> 매매목록
     */
    List<PurchaseLog> findByCreatedAtBetween(LocalDateTime fromDate, LocalDateTime toDate);

}
