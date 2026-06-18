package com.codeforge.project.application.dto.member;

import com.codeforge.project.application.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
