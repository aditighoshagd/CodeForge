package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.subscription.PlanLimitsResponse;
import com.codeforge.project.application.dto.subscription.UsageTodayResponse;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
