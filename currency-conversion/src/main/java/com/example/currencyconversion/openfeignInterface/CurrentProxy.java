package com.example.currencyconversion.openfeignInterface;

import com.example.currencyconversion.dto.CurrencyExchange;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url = "localhost:8001")
//توی ورودی اسم اون ماژولی رو قرار میدیم که میخوایم بهش request بزنم و توی .propertie بهش اسم دادم
//پورتی رومیدیم که currency-exchange روش داره میاد بالا

public interface CurrentProxy {
    @GetMapping("currency-exchange/firstname/{firstname}/lastname/{lastname}")
    CurrencyExchange exchange(@PathVariable String firstname,
                              @PathVariable String lastname);
}
