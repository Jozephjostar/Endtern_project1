package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.Track;
import com.example.endtern_project1.repository.TrackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController {

    private final TrackRepository repo;

    public TrackController(TrackRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Track> getAllTracks() {
        return repo.findAll();
    }
}