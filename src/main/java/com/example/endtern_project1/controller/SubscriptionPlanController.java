package com.example.endtern_project1.controller;

import com.example.endtern_project1.model.SubscriptionPlan;
import com.example.endtern_project1.repository.SubscriptionPlanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
public class SubscriptionPlanController {

    private final SubscriptionPlanRepository repo;

    public SubscriptionPlanController(SubscriptionPlanRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<SubscriptionPlan> getAllPlans() {
        return repo.findAll();
    }
}