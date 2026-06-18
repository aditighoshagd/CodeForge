package com.codeforge.project.application.service;


import com.codeforge.project.application.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
