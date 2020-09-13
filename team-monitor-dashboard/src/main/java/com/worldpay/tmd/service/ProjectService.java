package com.worldpay.tmd.service;

import com.worldpay.tmd.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjectsByTeam(String teamName);
}
