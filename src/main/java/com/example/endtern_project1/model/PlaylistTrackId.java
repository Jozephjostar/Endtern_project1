package com.example.endtern_project1.model;

import java.io.Serializable;
import java.util.Objects;

public class PlaylistTrackId implements Serializable {

    private Long playlistId;
    private Long trackId;

    public PlaylistTrackId() {}

    public PlaylistTrackId(Long playlistId, Long trackId) {
        this.playlistId = playlistId;
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaylistTrackId)) return false;
        PlaylistTrackId that = (PlaylistTrackId) o;
        return Objects.equals(playlistId, that.playlistId) &&
                Objects.equals(trackId, that.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId);
    }
}