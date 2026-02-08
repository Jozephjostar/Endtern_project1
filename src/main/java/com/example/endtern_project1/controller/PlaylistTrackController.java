package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.PlaylistTrack;
import com.example.endtern_project1.repository.PlaylistTrackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist-tracks")
public class PlaylistTrackController {

    private final PlaylistTrackRepository repo;

    public PlaylistTrackController(PlaylistTrackRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<PlaylistTrack> getAllPlaylistTracks() {
        return repo.findAll();
    }
}