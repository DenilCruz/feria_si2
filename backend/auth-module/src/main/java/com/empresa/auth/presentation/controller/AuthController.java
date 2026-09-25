package com.empresa.auth.presentation.controller;

import com.empresa.auth.application.dto.LoginRequest;
import com.empresa.auth.application.dto.TokenResponse;
import com.empresa.auth.application.usecase.LoginUseCase;
import com.empresa.shared.dto.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final LoginUseCase loginUseCase;

    public AuthController(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<TokenResponse>> login(@Valid @RequestBody LoginRequest request) {
        TokenResponse token = loginUseCase.execute(request);
        return ResponseEntity.ok(ApiResponse.ok(token, "Login exitoso"));
    }
}
