package com.workintech.model;

public class Task {
    private String project;
    private String description;
    private String assignee;
    public enum Priority {
        HIGH,
        MEDIUM,
        LOW,
    }
    public enum Status {
        IN_QUEQUE,
        ASSIGNED,
        IN_PROGRESS,
    }


}
