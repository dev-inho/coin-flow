CREATE TABLE IF NOT EXISTS purchase_log (
       idx BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '구매 로그 IDX'
     , content VARCHAR(255) COMMENT '로그 내용'
     , created_at TIMESTAMP NOT NULL COMMENT '생성일'
     , coin_name VARCHAR(255) NOT NULL COMMENT '코인명'
     , coin_price int NOT NULL COMMENT '코인 가격'
);

CREATE TABLE IF NOT EXISTS trade_log (
      idx BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '구매 로그 IDX'
    , content VARCHAR(255) COMMENT '로그 내용'
    , created_at TIMESTAMP NOT NULL COMMENT '생성일'
    , coin_name VARCHAR(255) NOT NULL COMMENT '코인명'
    , coin_price int NOT NULL COMMENT '코인 가격'
);
