package com.codeforge.project.application.dto.project;

public record FileNode(
        String path
) {

    @Override
    public String toString() {
        return path;
    }
}
