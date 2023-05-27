package com.example.currencyconversion.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CurrencyExchange {
    private long id;
    private String firstname;
    private String lastname;
    private BigDecimal conversionMultiple;
    private String port;//این فیلد رو برای این قرار دادیم ک ببینیم هر portاز کجا جنریت میشه


}
