package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}