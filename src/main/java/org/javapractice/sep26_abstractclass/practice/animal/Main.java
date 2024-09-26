package org.javapractice.sep26_abstractclass.practice.animal;

public class Main {
    public static void main(String[] args) {
        var fox = new Fox("Алиса");
        System.out.println(fox.getName());
        fox.attack();
        fox.go();
        fox.leave();
        fox.stop();
        fox.sleep();

    }
}
