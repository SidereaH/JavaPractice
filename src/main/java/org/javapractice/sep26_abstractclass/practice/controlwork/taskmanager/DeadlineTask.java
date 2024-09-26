package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

public class DeadlineTask extends Task{
    private String deadlineDate;

    public DeadlineTask(String taskName, String taskDescription, String dateOFCreate, String deadlineDate) {
        super(taskName, taskDescription, dateOFCreate);
        this.deadlineDate = deadlineDate;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}
