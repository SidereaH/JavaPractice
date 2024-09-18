package org.javapractice.sep10.baseclass;

public class Cat  extends Animal {
    private String tail;
    private static int count = 0;
    public Cat(String brain, String heart, String hvost) {
        super(brain, heart);
        this.tail = hvost;
        count++;
        System.out.println("Котов - " + Cat.getCount());
    }
    @Override
    public String toString() {
        return "Cat{" +
                "tail='" + tail + '\'' +
                ", brain='" + super.getBrain() + '\'' +
                ", heart='" + super.getHeart() + '\'' +
                '}';
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public static int getCount() {
        return count;
    }
}
