package com.example.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>{

    User findByUsername(String username);
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    List<User> findAllByAgeGreaterThanEqual(Integer age);

}
