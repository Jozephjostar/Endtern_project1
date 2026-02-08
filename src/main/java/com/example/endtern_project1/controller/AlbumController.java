package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.Album;
import com.example.endtern_project1.repository.AlbumRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumRepository repo;

    public AlbumController(AlbumRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Album> getAllAlbums() {
        return repo.findAll();
    }
}