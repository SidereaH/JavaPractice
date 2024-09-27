package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

import java.time.LocalDate;

public class DeadlineTask extends Task{
    private LocalDate deadlineDate;

    public DeadlineTask(String taskName, String taskDescription, LocalDate dateOFCreate, LocalDate deadlineDate) {
        super(taskName, taskDescription, dateOFCreate);
        this.deadlineDate = deadlineDate;
    }

    public String getDeadlineDate() {
        return String.valueOf(deadlineDate);
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String toString() {
        return super.toString()+"DeadlineTask{" +
                "deadlineDate=" + deadlineDate +
                '}';
    }
}
