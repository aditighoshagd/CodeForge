package com.codeforge.project.application.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
