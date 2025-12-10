package com.lovable.ai.dto.member;

import com.lovable.ai.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
