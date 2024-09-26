package org.javapractice.sep26_abstractclass.practice.animal;

public class Fox extends Animal{
    private String name;


    public Fox(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
