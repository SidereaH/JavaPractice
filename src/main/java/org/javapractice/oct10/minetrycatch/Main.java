package org.javapractice.oct10.minetrycatch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        var dog = new Dog("nikitka");
        dog.putCollar();
        dog.putLeash();
        try {
            dog.walk();
        } catch (DogIsNotreadyException e) {
            System.out.println(e.getMessage());
            System.out.printf("Вы не все одели: намордник - %s, воротник - %s, поводок - %s",dog.isLeashPutOn(),dog.isMuzzlePutOn(),dog.isCollarPutOn());
        }
    }
}
