package com.example.endtern_project1.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;

    private String artistName;
    private String country;

    // Constructors, getters, setters
    public Artist() {}
    public Artist(String artistName, String country) {
        this.artistName = artistName;
        this.country = country;
    }
    public Long getArtistId() { return artistId; }
    public void setArtistId(Long artistId) { this.artistId = artistId; }
    public String getArtistName() { return artistName; }
    public void setArtistName(String artistName) { this.artistName = artistName; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}