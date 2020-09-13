package com.worldpay.tmd.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SonarDTO {

    private BigDecimal coverage;
    private Integer trending;
}
