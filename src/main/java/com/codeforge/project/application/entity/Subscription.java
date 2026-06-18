package com.codeforge.project.application.entity;

import com.codeforge.project.application.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;
    User user;
    Plan plan;

    SubscriptionStatus status; // can only have values from the enum

    String stripeCustomerId;
    String stripeSubscription;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd= false;

    Instant createdAt;
    Instant updatedAt;

}
