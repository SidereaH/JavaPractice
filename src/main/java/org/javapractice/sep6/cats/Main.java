package org.javapractice.sep6.cats;

public class Main {
    public static void main(String[] args) {
        var cat = new Cat();
        cat.sayHi("alesha");

        cat.sayHi("Andrey", "Nikita");

        String[] names = new String[]{"Oleg", "Nikita", "Andrey"};
        cat.sayHi(names);
        cat.sayHi("Andrey", "Nikita","Andrey", "Nikita","Andrey", "Nikita","Andrey", "Nikita","Andrey", "Nikita","Andrey", "Nikita");
    }
}
