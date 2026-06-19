package com.codeforge.project.application.service;



import com.codeforge.project.application.dto.member.InviteMemberRequest;
import com.codeforge.project.application.dto.member.MemberResponse;
import com.codeforge.project.application.dto.member.UpdateMemberRoleRequest;
import com.codeforge.project.application.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
