package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.project.ProjectRequest;
import com.codeforge.project.application.dto.project.ProjectResponse;
import com.codeforge.project.application.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}