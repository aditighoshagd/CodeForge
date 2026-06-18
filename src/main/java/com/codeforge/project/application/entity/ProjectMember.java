package com.codeforge.project.application.entity;

import com.codeforge.project.application.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    Project project;
    User user;
    ProjectMemberId id;
    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
