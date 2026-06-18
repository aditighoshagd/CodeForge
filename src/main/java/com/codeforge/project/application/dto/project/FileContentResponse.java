package com.codeforge.project.application.dto.project;

public record FileContentResponse(
        String path,
        String content
) {
}
