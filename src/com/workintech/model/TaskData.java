package com.workintech.model;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTask = new HashSet<>();
    private Set<Task> bobsTask = new HashSet<>();
    private Set<Task> carolsTask = new HashSet<>();

    public Set<Task> getTasks(String assignee) {
        Set<Task> tasks = new HashSet<>();
        if ("ann".equals(assignee)) {
            tasks.addAll(annsTask);
        } else if ("bob".equals(assignee)) {
            tasks.addAll(bobsTask);
        } else if ("carol".equals(assignee)) {
            tasks.addAll(carolsTask);
        } else if ("all".equals(assignee)) {
            tasks.addAll(annsTask);
            tasks.addAll(bobsTask);
            tasks.addAll(carolsTask);
        }
        return tasks;
    }
}
