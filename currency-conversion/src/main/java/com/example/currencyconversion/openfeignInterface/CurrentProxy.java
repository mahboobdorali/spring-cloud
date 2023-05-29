package com.example.currencyconversion.openfeignInterface;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "currency-exchange",url = "localhost:8000")
//توی ورودی اسم اون ماژولی رو قرار میدیم که میخوایم بهش request بزنم و توی .propertie بهش اسم دادم
public interface CurrentProxy {

}
