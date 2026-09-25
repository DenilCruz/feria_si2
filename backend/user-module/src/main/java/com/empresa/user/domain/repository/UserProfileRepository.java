package com.empresa.user.domain.repository;

import com.empresa.user.domain.model.UserProfile;
import java.util.Optional;
import java.util.UUID;

public interface UserProfileRepository {
    Optional<UserProfile> findById(UUID id);
}
