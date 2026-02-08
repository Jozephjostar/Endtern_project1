package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {
}