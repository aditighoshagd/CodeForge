package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.project.ProjectResponse;
import com.codeforge.project.application.dto.project.ProjectSummaryResponse;
import com.codeforge.project.application.entity.Project;
import com.codeforge.project.application.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
