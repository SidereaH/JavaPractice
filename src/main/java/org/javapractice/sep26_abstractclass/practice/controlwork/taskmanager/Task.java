package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

public class Task {
    private String taskName;
    private String taskDescription;
    private String dateOFCreate;

    public Task(String taskName, String taskDescription, String dateOFCreate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dateOFCreate = dateOFCreate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDateOFCreate() {
        return dateOFCreate;
    }

    public void setDateOFCreate(String dateOFCreate) {
        this.dateOFCreate = dateOFCreate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dateOFCreate='" + dateOFCreate + '\'' +
                '}';
    }

}
