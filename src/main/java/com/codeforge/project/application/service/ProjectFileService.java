package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.project.FileContentResponse;
import com.codeforge.project.application.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
