package com.worldpay.tmd.dto;

import lombok.Data;

@Data
public class TmdDTO {
    private ProjectDTO projectDTO;
    private ReleaseDTO releaseDTO;
    private String lastUpdate;
}
