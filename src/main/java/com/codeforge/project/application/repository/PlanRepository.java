package com.codeforge.project.application.repository;
import com.codeforge.project.application.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PlanRepository extends JpaRepository<Plan, Long> {
}
