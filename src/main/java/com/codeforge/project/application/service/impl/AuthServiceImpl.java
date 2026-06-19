package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.auth.AuthResponse;
import com.codeforge.project.application.dto.auth.LoginRequest;
import com.codeforge.project.application.dto.auth.SignupRequest;
import com.codeforge.project.application.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
