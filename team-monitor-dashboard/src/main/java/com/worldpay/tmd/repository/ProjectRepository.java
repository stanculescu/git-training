package com.worldpay.tmd.repository;

import com.worldpay.tmd.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByTeamName(String name);
}
