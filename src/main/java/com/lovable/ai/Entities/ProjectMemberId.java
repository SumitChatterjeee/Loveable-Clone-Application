package com.lovable.ai.Entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ProjectMemberId {
    Long projectId;
    Long userId;
}
