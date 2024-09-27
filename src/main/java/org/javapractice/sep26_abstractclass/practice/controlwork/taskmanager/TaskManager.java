package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

import java.util.ArrayList;

public class TaskManager {
    private  ArrayList<ReccuringTask> reccuringTasks;
    private  ArrayList<DeadlineTask> deadlineTasks;
    private  ArrayList<Task> tasks = new ArrayList<>();
    private static int count = 0;
//    public TaskManager(PriorityQueue<DeadlineTask> deadlineTasks){
//        this.deadlineTasks = deadlineTasks;
//        this.reccuringTasks = new PriorityQueue<>();
//    }
    public TaskManager(ArrayList<ReccuringTask> reccuringTasks ){
        deadlineTasks = new ArrayList<>();
        this.reccuringTasks = reccuringTasks;
    }
    public TaskManager(){
        deadlineTasks = new ArrayList<>();
        reccuringTasks = new ArrayList<>();
    }

    public TaskManager(ArrayList<DeadlineTask> deadlineTasks,ArrayList<ReccuringTask> reccuringTasks ){
        this.deadlineTasks = deadlineTasks;
        this.reccuringTasks = reccuringTasks;
    }

    public  ArrayList<ReccuringTask> getReccuringTasks() {
        return reccuringTasks;
    }

    public void setReccuringTasks(ArrayList<ReccuringTask> reccuringTasks) {
        this.reccuringTasks = reccuringTasks;
    }

    public ArrayList<DeadlineTask> getDeadlineTasks() {
        return this.deadlineTasks;
    }

    public void setDeadlineTasks(ArrayList<DeadlineTask> deadlineTasks) {
        this.deadlineTasks = deadlineTasks;
    }

    public  void addTasks(ReccuringTask ... tasks){

        for (ReccuringTask task : tasks){
            this.reccuringTasks.add(task);
            this.tasks.add(task);
        }


    }
    public void addTasks(DeadlineTask ... tasks){
        for (DeadlineTask task : tasks){
            this.deadlineTasks.add(task);
            this.tasks.add(task);

        }


    }
    public int getCount(){
        return count;
    }
    public String searchById(int id){
        for (ReccuringTask task : reccuringTasks){
            if (task.getId() == id){
                return "reoccurring";
            }
        }
        for (DeadlineTask task : deadlineTasks){
            if (task.getId() == id){
                return "deadline";
            }
        }
        return null;
    }
    public Task getTaskById(int id){
        for (ReccuringTask task : reccuringTasks){
            if (task.getId() == id){
                return task;
            }
        }
        for (DeadlineTask task : deadlineTasks){
            if (task.getId() == id){
                return task;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "TaskManager{" +
                "reccuringTasks=" + reccuringTasks +
                ", deadlineTasks=" + deadlineTasks +
                ", tasks=" + tasks +
                '}';
    }
}
