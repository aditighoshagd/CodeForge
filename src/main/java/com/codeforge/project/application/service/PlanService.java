package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
