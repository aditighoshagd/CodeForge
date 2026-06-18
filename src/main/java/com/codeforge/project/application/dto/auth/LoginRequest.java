package com.codeforge.project.application.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
