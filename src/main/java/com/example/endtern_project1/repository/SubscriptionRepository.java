package com.example.endtern_project1.repository;

import com.example.endtern_project1.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}