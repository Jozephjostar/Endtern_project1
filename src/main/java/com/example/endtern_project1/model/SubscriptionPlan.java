package com.example.endtern_project1.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="subscription_plans")
public class SubscriptionPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="plan_id")
    private Long planId;

    @Column(name="plan_name")
    private String planName;

    private BigDecimal price;

    public SubscriptionPlan() {}

    public Long getPlanId() { return planId; }
    public void setPlanId(Long planId) { this.planId = planId; }

    public String getPlanName() { return planName; }
    public void setPlanName(String planName) { this.planName = planName; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}