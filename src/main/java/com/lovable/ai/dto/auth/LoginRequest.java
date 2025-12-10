package com.lovable.ai.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
