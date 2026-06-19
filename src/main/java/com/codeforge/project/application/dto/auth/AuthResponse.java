package com.codeforge.project.application.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
