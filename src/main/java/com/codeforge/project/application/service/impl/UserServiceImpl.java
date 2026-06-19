package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.auth.UserProfileResponse;
import com.codeforge.project.application.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
