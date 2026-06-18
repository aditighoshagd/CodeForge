package com.codeforge.project.application.service;


import com.codeforge.project.application.dto.auth.AuthResponse;
import com.codeforge.project.application.dto.auth.LoginRequest;
import com.codeforge.project.application.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
