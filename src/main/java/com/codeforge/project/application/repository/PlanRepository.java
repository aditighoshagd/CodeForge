package com.codeforge.project.application.repository;
import com.codeforge.project.application.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PlanRepository extends JpaRepository<Plan, Long> {
    Optional<Plan> findByStripePriceId(String id);
}