package org.javapractice.sep5;

public interface AnimalTemp {
    void setName(String newName);
    void setAge(int age);
    String getName();
    int getAge();
    default void print(){
        System.out.println("Its animal!");
    }

}
