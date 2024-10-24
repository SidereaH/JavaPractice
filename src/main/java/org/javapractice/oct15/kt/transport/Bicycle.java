package org.javapractice.oct15.kt.transport;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Велосипед готов к поездке");
    }
}