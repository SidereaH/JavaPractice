package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

import java.time.LocalDate;

public class ReccuringTask extends Task{
    String intervalOfTask;
    LocalDate dateOfStart;

    public ReccuringTask(String taskName, String taskDescription, LocalDate dateOFCreate, String intervalOfTask, LocalDate dateOfStart) {
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
        return String.valueOf(dateOfStart);
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return super.toString() +
                "intervalOfTask='" + intervalOfTask + '\'' +
                ", dateOfStart=" + dateOfStart +
                '}';
    }
}
