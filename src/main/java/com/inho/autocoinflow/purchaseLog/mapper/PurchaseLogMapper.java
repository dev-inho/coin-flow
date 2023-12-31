package com.inho.autocoinflow.purchaseLog.mapper;

import com.inho.autocoinflow.purchaseLog.PurchaseLog;
import com.inho.autocoinflow.purchaseLog.dto.PurchaseLogDTO;
import com.inho.autocoinflow.tradeLog.dto.TradeLogDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface PurchaseLogMapper {

    /**
     * 로그 추가
     * @param purchaseLogDTO 저장하기 위한 데이터
     * @return affected row
     */
    int addPurchaseLog(PurchaseLogDTO purchaseLogDTO);

    /**
     * 로그 특정일 바탕으로 조회
     * @param inputs {fromDate: LocalDateTime, toDate: LocalDateTime}
     * @return 특정 기간 내 조회 된 정보
     */
    List<PurchaseLog> findByCreatedAtBetween(Map<String, Objects> inputs);
}
