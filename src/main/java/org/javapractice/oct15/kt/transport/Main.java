package org.javapractice.oct15.kt.transport;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car(),
                new Bicycle()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
