package com.example.endtern_project1.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="playlist_id")
    private Long playlistId;

    @Column(name="playlist_name")
    private String playlistName;

    @Column(name="user_id")
    private Long userId;

    @Column(name="creation_date")
    private LocalDate creationDate;

    public Playlist() {}

    public Long getPlaylistId() { return playlistId; }
    public void setPlaylistId(Long playlistId) { this.playlistId = playlistId; }

    public String getPlaylistName() { return playlistName; }
    public void setPlaylistName(String playlistName) { this.playlistName = playlistName; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }
}