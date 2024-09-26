package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

public class Main {
    public static void main(String[] args) {
        var rectask = new ReccuringTask("Почистить зубы", "Взять щетку почистить зубы", "29.09.2024", "ежедневно", "29.09.2024");
        var deadlineTask = new DeadlineTask("Решить кт", "решить кт по джаве", "29.09.2024", "30.09.2024");

        System.out.println(rectask.getIntervalOfTask());
        System.out.println(deadlineTask.getDeadlineDate());

        var manager = new TaskManager();
        manager.addTasks(rectask);
        manager.addTasks(deadlineTask);
        System.out.println(manager);

    }
}
