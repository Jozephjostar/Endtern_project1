package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.Playlist;
import com.example.endtern_project1.repository.PlaylistRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private final PlaylistRepository repo;

    public PlaylistController(PlaylistRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Playlist> getAllPlaylists() {
        return repo.findAll();
    }
}