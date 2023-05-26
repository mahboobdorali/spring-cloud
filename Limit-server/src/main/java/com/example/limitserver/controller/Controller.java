package com.example.limitserver.controller;

import com.example.limitserver.config.Configuration;
import com.example.limitserver.dto.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieved() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
