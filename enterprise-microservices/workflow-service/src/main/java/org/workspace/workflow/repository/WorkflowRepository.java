package org.workspace.workflow.repository;

import org.workspace.workflow.model.WorkflowActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkflowRepository extends JpaRepository<WorkflowActivity, Long> {}
