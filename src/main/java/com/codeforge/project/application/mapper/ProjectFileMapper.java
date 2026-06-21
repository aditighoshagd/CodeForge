package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.project.FileNode;
import com.codeforge.project.application.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
