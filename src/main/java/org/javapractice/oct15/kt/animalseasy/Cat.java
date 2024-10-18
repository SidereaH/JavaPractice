package org.javapractice.oct15.kt.animalseasy;

import java.util.TimerTask;

public class Cat extends Animal {
    private String name;
    private int age;
    private Type type = Type.CAT;
    public Cat(){

    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getType(){
        return type.toString();
    }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
