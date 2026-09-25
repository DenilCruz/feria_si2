package com.empresa.user.presentation.controller;

import com.empresa.shared.dto.ApiResponse;
import com.empresa.user.application.dto.UserResponseDto;
import com.empresa.user.application.usecase.GetUserProfileUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final GetUserProfileUseCase getUserProfileUseCase;

    public UserController(GetUserProfileUseCase getUserProfileUseCase) {
        this.getUserProfileUseCase = getUserProfileUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> getUser(@PathVariable UUID id) {
        UserResponseDto user = getUserProfileUseCase.execute(id);
        return ResponseEntity.ok(ApiResponse.ok(user, "Usuario obtenido"));
    }
}
