package com.example.endtern_project1.model;

import jakarta.persistence.*;

@Entity
@Table(name="playlist_tracks")
@IdClass(PlaylistTrackId.class)
public class PlaylistTrack {

    @Id
    @Column(name="playlist_id")
    private Long playlistId;

    @Id
    @Column(name="track_id")
    private Long trackId;

    public PlaylistTrack() {}

    public Long getPlaylistId() { return playlistId; }
    public void setPlaylistId(Long playlistId) { this.playlistId = playlistId; }

    public Long getTrackId() { return trackId; }
    public void setTrackId(Long trackId) { this.trackId = trackId; }
}