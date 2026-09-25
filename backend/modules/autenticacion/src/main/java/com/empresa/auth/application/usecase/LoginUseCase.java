package com.empresa.auth.application.usecase;

import com.empresa.auth.application.dto.LoginRequest;
import com.empresa.auth.application.dto.TokenResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginUseCase {
    public TokenResponse execute(LoginRequest request) {
        // Implementación de login y emisión de token
        return TokenResponse.of("mock_access_token", "mock_refresh_token", 3600);
    }
}
