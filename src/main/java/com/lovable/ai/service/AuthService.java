package com.lovable.ai.service;

import com.lovable.ai.dto.auth.AuthResponse;
import com.lovable.ai.dto.auth.LoginRequest;
import com.lovable.ai.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);
    AuthResponse login(LoginRequest request);
    
}
