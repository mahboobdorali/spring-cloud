package com.example.currencyexchange.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CurrencyExchange {
    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String port;//این فیلد رو برای این قرار دادیم ک ببینیم هر portاز کجا جنریت میشه

    public CurrencyExchange(long id, String from, String to, String port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.port = port;
    }
}
