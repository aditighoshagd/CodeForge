package com.codeforge.project.application.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;
    String stripePrice;
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews; // max no of previews allowed per plan
    Boolean unlimitedAi; //unlimited access to LLM, ignores maxTokenPerDay if true -> no usage

    Boolean active;
}
