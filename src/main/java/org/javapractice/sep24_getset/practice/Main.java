package org.javapractice.sep24_getset.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        var nikitka = new People(12, "nikitka");

        System.out.println("task 2");
        IncrediblePeople bro = IncrediblePeople.createPeople(12,"oleg");
        //incrediblepeople
        System.out.println("Task 3");
        nikitka.setAge(18);
        System.out.println(nikitka.getAge());

    }
}
