package com.inho.autocoinflow.purchaseLog.service.impl;

import com.inho.autocoinflow.purchaseLog.domain.PurchaseLog;
import com.inho.autocoinflow.purchaseLog.service.PurchaseLogService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseLogServiceImpl implements PurchaseLogService {

    private final Logger logger = LoggerFactory.getLogger(PurchaseLogServiceImpl.class);

    @Override
    public void addPurchaseLog(String content, String coinName, long coinPrice) {

    }

    @Override
    public List<PurchaseLog> findByCreatedAtBetween(LocalDateTime fromDate, LocalDateTime toDate) {
        return null;
    }

}
