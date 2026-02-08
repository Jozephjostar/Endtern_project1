package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}