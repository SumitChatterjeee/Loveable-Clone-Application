package com.lovable.ai.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
