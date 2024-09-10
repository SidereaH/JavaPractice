package org.javapractice.sep6.cats;

public class Cat {

    public void sayHi(String name){
        System.out.printf("""
                Привет, %s! Как дела?
                %n""", name);
    }
    public void sayHi(String firstName, String secondName){
        System.out.printf("""
                Привет, %s, %s!
                Как у вас дела?""", firstName, secondName);
    }

    public void sayHi(String ... names){
        for (String name : names){
            System.out.printf("""
                Привет, %s! Как дела?
                """, name);
        }
        System.out.println();
    }

}
