package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.subscription.CheckoutRequest;
import com.codeforge.project.application.dto.subscription.CheckoutResponse;
import com.codeforge.project.application.dto.subscription.PortalResponse;
import com.codeforge.project.application.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);
}
