package org.example;


public class Cat extends Animal {
    private String owner;
    public Cat(String name, int age, String owner){
        super(name, age);
        this.owner = owner;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }
    public String getOwner(){
        return this.owner;
    }
    @Override
    public String toString(){
        return String.format("""
                Cat name is: %s;
                Cat age is: %d;
                Cats owner: %s;
                Cats counted:%d.
                """, super.getName(), super.getAge(), this.owner, super.getCount());

    }
}
