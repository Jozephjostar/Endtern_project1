package com.example.endtern_project1.model;

import jakarta.persistence.*;

@Entity
@Table(name="tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="track_id")
    private Long trackId;

    @Column(name="track_name")
    private String trackName;

    private Integer duration;

    @Column(name="album_id")
    private Long albumId;

    @Column(name="genre_id")
    private Long genreId;

    @Column(name="artist_id")
    private Long artistId;

    public Track() {}

    public Long getTrackId() { return trackId; }
    public void setTrackId(Long trackId) { this.trackId = trackId; }

    public String getTrackName() { return trackName; }
    public void setTrackName(String trackName) { this.trackName = trackName; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public Long getAlbumId() { return albumId; }
    public void setAlbumId(Long albumId) { this.albumId = albumId; }

    public Long getGenreId() { return genreId; }
    public void setGenreId(Long genreId) { this.genreId = genreId; }

    public Long getArtistId() { return artistId; }
    public void setArtistId(Long artistId) { this.artistId = artistId; }
}