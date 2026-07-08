package com.codeforge.project.application.service;

import com.codeforge.project.application.dto.deploy.DeployResponse;

public interface DeploymentService {

    DeployResponse deploy(Long projectId);
}
