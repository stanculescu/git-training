package com.worldpay.tmd.controller;

import com.worldpay.tmd.dto.TmdDTO;
import com.worldpay.tmd.model.Project;
import com.worldpay.tmd.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TmdController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/test")
    public TmdDTO getProjectsForTeam() {
        TmdDTO tmdDTO = new TmdDTO();

        List<Project> projectList = projectService.getProjectsByTeam("ALPHAS");

        tmdDTO.setLastUpdate("123");
        return tmdDTO;
    }

    @PostMapping("/test")
    public String post() {
        return "test post";
    }
}
