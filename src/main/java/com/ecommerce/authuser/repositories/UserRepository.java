package com.ecommerce.authuser.repositories;

import com.ecommerce.authuser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByUsername(String user);
    Optional<User> findByEmail(String email);
}
