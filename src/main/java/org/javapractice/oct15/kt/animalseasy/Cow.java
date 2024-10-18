package org.javapractice.oct15.kt.animalseasy;

public class Cow extends Animal {
    private String name;
    private int age;
    private Type type = Type.COW;
    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cow(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType(){
        return type.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Moooooooooooo");
    }
}
