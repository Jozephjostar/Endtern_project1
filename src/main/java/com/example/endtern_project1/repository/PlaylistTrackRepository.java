package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.PlaylistTrack;
import com.example.endtern_project1.model.PlaylistTrackId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistTrackRepository extends JpaRepository<PlaylistTrack, PlaylistTrackId> {
}