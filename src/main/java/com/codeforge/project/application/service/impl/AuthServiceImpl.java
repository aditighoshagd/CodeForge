package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.auth.AuthResponse;
import com.codeforge.project.application.dto.auth.LoginRequest;
import com.codeforge.project.application.dto.auth.SignupRequest;
import com.codeforge.project.application.entity.User;
import com.codeforge.project.application.error.BadRequestException;
import com.codeforge.project.application.mapper.UserMapper;
import com.codeforge.project.application.repository.UserRepository;
import com.codeforge.project.application.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse signup(SignupRequest request) {
        userRepository.findByUsername(request.username()).ifPresent(user -> {
            throw new BadRequestException("User already exists with username: "+request.username());
        });

        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.password()));
        user = userRepository.save(user);

        return new AuthResponse("dummy", userMapper.toUserProfileResponse(user));
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
