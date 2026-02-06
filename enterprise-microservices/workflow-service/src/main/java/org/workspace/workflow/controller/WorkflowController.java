package org.workspace.workflow.controller;

import org.workspace.workflow.model.WorkflowActivity;
import org.workspace.workflow.repository.WorkflowRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/activities")
public class WorkflowController {

    private final WorkflowRepository repo;

    public WorkflowController(WorkflowRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<WorkflowActivity> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public WorkflowActivity create(@RequestBody WorkflowActivity activity) {
        return repo.save(activity);
    }
}
