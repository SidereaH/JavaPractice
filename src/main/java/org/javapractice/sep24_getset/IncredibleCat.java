package org.javapractice.sep24_getset;

import java.io.IOException;

public class IncredibleCat {
    private String name;
    private int age;
    private int weight;

    public IncredibleCat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public IncredibleCat(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyException{
        if (!name.isEmpty()) this.name = name;
        else {
            throw new EmptyException("Is Empty");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight)  {
        if(weight>=0 && weight<1000) this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }
    public void sayMeow(){
        System.out.println("Meow");
    }

    @Override
    public String toString(){
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}
