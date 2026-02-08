package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.Subscription;
import com.example.endtern_project1.repository.SubscriptionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionRepository repo;

    public SubscriptionController(SubscriptionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Subscription> getAllSubscriptions() {
        return repo.findAll();
    }
}