package com.empresa.auth.infrastructure.security;

import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    public String generateToken(String username) {
        return "token_" + username;
    }

    public boolean validateToken(String token) {
        return token != null && !token.isBlank();
    }
}
