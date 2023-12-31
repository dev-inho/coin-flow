package com.inho.autocoinflow.tradeLog.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradeLogMapper {

    /**
     * 매매로그 저장
     * @return int affected_ow
     */
    int addTradeLog();

}
