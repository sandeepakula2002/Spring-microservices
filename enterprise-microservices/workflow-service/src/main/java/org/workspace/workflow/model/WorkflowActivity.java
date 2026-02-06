package org.workspace.workflow.model;

import jakarta.persistence.*;

@Entity
public class WorkflowActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;

    private String activityTitle;
    private String details;
    private Long assignedUserId;

    public Long getActivityId() { return activityId; }
    public void setActivityId(Long activityId) { this.activityId = activityId; }

    public String getActivityTitle() { return activityTitle; }
    public void setActivityTitle(String activityTitle) { this.activityTitle = activityTitle; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public Long getAssignedUserId() { return assignedUserId; }
    public void setAssignedUserId(Long assignedUserId) { this.assignedUserId = assignedUserId; }
}
