package com.worldpay.tmd.service.impl;

import com.worldpay.tmd.model.Project;
import com.worldpay.tmd.repository.ProjectRepository;
import com.worldpay.tmd.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getProjectsByTeam(String teamName) {
        return projectRepository.findAllByTeamName(teamName);
    }
}
