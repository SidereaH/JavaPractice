package org.javapractice.october4.nestedclasses.innerclasses;

public class Main {
    public static void main(String[] args) {
        var bike = new Bicycle("z", 5);
        var handleBar = bike.new HandleBar();
        var seat = bike.new Seat();
        handleBar.left();
        handleBar.right();
        seat.up();
        seat.down();
        bike.start();
        seat.getSeatParam();

    }
}
