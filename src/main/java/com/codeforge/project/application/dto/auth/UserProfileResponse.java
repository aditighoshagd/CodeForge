package com.codeforge.project.application.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
