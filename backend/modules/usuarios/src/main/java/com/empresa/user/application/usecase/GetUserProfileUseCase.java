package com.empresa.user.application.usecase;

import com.empresa.user.application.dto.UserResponseDto;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class GetUserProfileUseCase {
    public UserResponseDto execute(UUID userId) {
        return new UserResponseDto(userId, "usuario@empresa.com", "Usuario Demo");
    }
}
