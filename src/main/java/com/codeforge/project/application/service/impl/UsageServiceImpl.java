package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.subscription.PlanLimitsResponse;
import com.codeforge.project.application.dto.subscription.UsageTodayResponse;
import com.codeforge.project.application.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
