package org.javapractice.oct15.kt.animalseasy;

public class Dog extends Animal {
    private String name;
    private int age;
    private Type type = Type.DOG;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(){}
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
    public void makeSound() {
        System.out.println("Woof");
    }
}
