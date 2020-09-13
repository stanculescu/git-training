package com.worldpay.tmd.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProjectDTO {

    private String teamName;
    private String name;
    private String currentTag;
    private boolean isDeployed;
    private String lastUpdate;
    private boolean upToDate;
    private SonarDTO sonarDTO;
    private List<JenkinsBuildDTO> jenkinsBuildDTOList;
}
