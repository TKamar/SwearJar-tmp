package com.DevTK.app.swearjar;

import java.util.Date;

public class Task {
    private String taskName;
    private Date dueDate;
    private boolean isCompleted;

    public Task(String taskName, Date dueDate) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
