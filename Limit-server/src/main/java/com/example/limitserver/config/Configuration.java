package com.example.limitserver.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("limit-server")
public class Configuration {
    private Integer minimum;
    private Integer maximum;
}
