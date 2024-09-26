package org.javapractice.sep26_abstractclass.practice.animal;

public abstract class Animal {
    private String name;
    private int age;

    public void go(){
        System.out.println("идем");
    }
    public void attack(){
        System.out.println("лови патрон");
    }
    public void leave(){
        System.out.println("уходим");
    }
    public void sleep(){
        System.out.println("спааать");
    }
    public void stop(){
        System.out.println("стоим");
    }
    public abstract String getName();
    public void getAge(){
        System.out.println("Неизвестно");
    }

}
