package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.subscription.PlanResponse;
import com.codeforge.project.application.dto.subscription.SubscriptionResponse;
import com.codeforge.project.application.entity.Plan;
import com.codeforge.project.application.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
