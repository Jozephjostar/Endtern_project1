package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}