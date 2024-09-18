package org.javapractice.sep10.baseclass;

public class Animal {
    private String brain;
    private String heart;
    private static int animalCount=0;
    public Animal(String brain, String heart) {
        System.out.println("Вызов конструктора Animal");
        this.brain = brain;
        this.heart = heart;
        animalCount++;
        System.out.println("Животных - " + animalCount);

    }

    public static int getCount() {
        return animalCount;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "brain='" + brain + '\'' +
                ", heart='" + heart + '\'' +
                '}';
    }
}
