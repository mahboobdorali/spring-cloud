package com.example.limitserver.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Limits {
    private Integer minimum;
    private Integer maximum;
}
