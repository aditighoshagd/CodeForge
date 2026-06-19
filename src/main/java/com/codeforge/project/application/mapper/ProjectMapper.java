package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.project.ProjectResponse;
import com.codeforge.project.application.dto.project.ProjectSummaryResponse;
import com.codeforge.project.application.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
