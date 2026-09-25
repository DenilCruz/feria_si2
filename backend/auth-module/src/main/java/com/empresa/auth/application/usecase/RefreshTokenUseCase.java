package com.empresa.auth.application.usecase;

import com.empresa.auth.application.dto.TokenResponse;
import org.springframework.stereotype.Service;

@Service
public class RefreshTokenUseCase {
    public TokenResponse execute(String refreshToken) {
        // Implementación de refresco de token
        return TokenResponse.of("mock_new_access_token", refreshToken, 3600);
    }
}
