package com.codeforge.project.application.dto.member;

import com.codeforge.project.application.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
