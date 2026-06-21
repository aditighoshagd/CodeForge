package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.project.FileContentResponse;
import com.codeforge.project.application.dto.project.FileNode;


import java.util.List;

public interface ProjectFileService {
    List<FileNode> getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
