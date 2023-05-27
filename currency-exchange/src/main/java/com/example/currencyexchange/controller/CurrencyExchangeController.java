package com.example.currencyexchange.controller;

import com.example.currencyexchange.dto.CurrencyExchange;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;//چون port رو میخوایم بهمون بده inject میکنیم

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrievedExchangeValue(@PathVariable String from,
                                                   @PathVariable String to) {
      String port=environment.getProperty("local.server.port");
        return new CurrencyExchange(10000L, from, to, BigDecimal.valueOf(50),port);

    }
    @GetMapping("/currency-exchange/firstname/{firstname}/lastname/{lastname}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String firstname,
            @PathVariable String lastname) {
        return new CurrencyExchange(1000, firstname, lastname, "5050");
    }
}
