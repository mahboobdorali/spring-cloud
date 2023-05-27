package com.example.currencyconversion.controller;

import com.example.currencyconversion.dto.CurrencyExchange;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class ConversionController {
    private final Environment environment;

    @GetMapping("/currency-conversion/firstname/{firstname}/lastname/{lastname}")
    public CurrencyExchange retrievedExchangeValue(
            @PathVariable String firstname,
            @PathVariable String lastname) {
        String port = environment.getProperty("local.server.port");
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("firstname", firstname);
        hashMap.put("lastname", lastname);
        ResponseEntity<CurrencyExchange> responseEntity = new RestTemplate().getForEntity("http://localhost:8001/currency-exchange/firstname/{firstname}/lastname/{lastname}",
                CurrencyExchange.class, hashMap);
        //داخل پرانتز میاد url کنترلری رو میگیره که میخوایم بره و از اون کنترلر ماژول دیگ جواب رو بگیره و بیاره
// مورد بعدی میگ خروجیش چی هست که اسم کلاس ماژولی ک توش هستیم رو بهش میدیم
        //مورد بعدی باید ورودی هارو به صورت key value بهش بدیم که از map برای اینکار استفاده میکنیم
        return responseEntity.getBody();
//یعنی خروجی فقط به من یه body بده
    }
}
