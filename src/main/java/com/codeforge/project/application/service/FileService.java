package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.project.FileContentResponse;
import com.codeforge.project.application.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
