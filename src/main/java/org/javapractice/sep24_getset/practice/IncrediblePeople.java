package org.javapractice.sep24_getset.practice;

public class IncrediblePeople {
    private int age;
    private String name;

    private IncrediblePeople(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static IncrediblePeople createPeople(int age, String name){
        return new IncrediblePeople(age, name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
