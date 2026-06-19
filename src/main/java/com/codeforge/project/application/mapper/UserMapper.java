package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.auth.SignupRequest;
import com.codeforge.project.application.dto.auth.UserProfileResponse;
import com.codeforge.project.application.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
