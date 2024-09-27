package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

import java.time.LocalDate;

public class Task {
    private String taskName;
    private String taskDescription;
    private LocalDate dateOFCreate;
    private static int count = 0;
    private int id;
    public Task(String taskName, String taskDescription, LocalDate dateOFCreate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dateOFCreate = dateOFCreate;
        this.id = count;
        count++;
    }
    public int getId(){
           return id;
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
        return String.valueOf(dateOFCreate);
    }

    public void setDateOFCreate(LocalDate dateOFCreate) {
        this.dateOFCreate = dateOFCreate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dateOFCreate=" + dateOFCreate +
                '}';
    }
}
