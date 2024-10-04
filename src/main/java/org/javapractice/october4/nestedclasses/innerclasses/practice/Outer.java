package org.javapractice.october4.nestedclasses.innerclasses.practice;

public class Outer {

    public class Inner {
        public Inner(){
            System.out.println("Creating inner");
        }
    }
    public static class Nested {
        public Nested(){
            System.out.println("Creating nested");
        }
    }
}
