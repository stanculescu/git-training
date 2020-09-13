package com.worldpay.tmd.dto;

import lombok.Data;

@Data
public class JenkinsBuildDTO {
    private Integer number;
    private boolean buildSuccess;
}
