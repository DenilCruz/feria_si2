package com.empresa.auth.domain.repository;

import com.empresa.auth.domain.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
    User save(User user);
}
