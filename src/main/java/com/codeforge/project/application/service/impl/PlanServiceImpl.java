package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.subscription.PlanResponse;
import com.codeforge.project.application.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
