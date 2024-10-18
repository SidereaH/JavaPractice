package org.javapractice.oct15.kt.animalseasy;

public abstract class Animal {

    public abstract void setName(String aasd);
    public abstract void setAge(int age);

    public enum Type{
        CAT, COW, DOG;
    }
    public abstract void makeSound();
    public abstract String getType();
    public abstract String getName();
    public abstract int getAge();

    @Override
    public String toString() {
        return "Animal - " + getName() + " " + getAge();
    }
}
