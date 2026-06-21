package com.codeforge.project.application.controller;

import com.codeforge.project.application.dto.project.ProjectRequest;
import com.codeforge.project.application.dto.project.ProjectResponse;
import com.codeforge.project.application.dto.project.ProjectSummaryResponse;
import com.codeforge.project.application.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        return ResponseEntity.ok(projectService.getUserProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getUserProjectById(id));
    }

    @PostMapping()
    public ResponseEntity<ProjectResponse> createProject(@RequestBody @Valid ProjectRequest request) {
        ProjectResponse response=projectService.createProject(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody @Valid ProjectRequest request) {
        return ResponseEntity.ok(projectService.updateProject(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.softDelete(id);
        return ResponseEntity.noContent().build();
    }

}

















