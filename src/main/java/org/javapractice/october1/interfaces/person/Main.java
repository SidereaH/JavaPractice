package org.javapractice.october1.interfaces.person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var bro = new People("Andrey Hutornoy", "Russia", LocalDate.parse("1978-12-16"), null);
        System.out.println(bro.getAge());
        bro.fillKnowleges("umni", "crutoi", "youurist");
        bro.fillCitizenships("Russian");
        System.out.println(bro.isPresidentable());

    }
}
