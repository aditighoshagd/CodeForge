package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.subscription.*;

import com.stripe.model.StripeObject;

import java.util.Map;
public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal(Long userId);

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}

