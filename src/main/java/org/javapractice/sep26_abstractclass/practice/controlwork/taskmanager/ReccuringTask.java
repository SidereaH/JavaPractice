package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

public class ReccuringTask extends Task{
    String intervalOfTask;
    String dateOfStart;

    public ReccuringTask(String taskName, String taskDescription, String dateOFCreate, String intervalOfTask, String dateOfStart) {
        super(taskName, taskDescription, dateOFCreate);
        this.intervalOfTask = intervalOfTask;
        this.dateOfStart = dateOfStart;
    }

    public String getIntervalOfTask() {
        return intervalOfTask;
    }

    public void setIntervalOfTask(String intervalOfTask) {
        this.intervalOfTask = intervalOfTask;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }


}
