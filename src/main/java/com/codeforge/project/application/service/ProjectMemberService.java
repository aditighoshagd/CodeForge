package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.member.InviteMemberRequest;
import com.codeforge.project.application.dto.member.MemberResponse;
import com.codeforge.project.application.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    void removeProjectMember(Long projectId, Long memberId);
}