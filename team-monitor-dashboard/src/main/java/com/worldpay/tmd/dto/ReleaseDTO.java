package com.worldpay.tmd.dto;

import lombok.Data;

@Data
public class ReleaseDTO {
    private Integer codeFreezeDaysLeft;
    private String codeFreezeDate;
    private Integer releaseDaysLeft;
    private String releaseDate;
}
