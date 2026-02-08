package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}