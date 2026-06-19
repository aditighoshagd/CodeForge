package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.subscription.CheckoutRequest;
import com.codeforge.project.application.dto.subscription.CheckoutResponse;
import com.codeforge.project.application.dto.subscription.PortalResponse;
import com.codeforge.project.application.dto.subscription.SubscriptionResponse;
import com.codeforge.project.application.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }
}