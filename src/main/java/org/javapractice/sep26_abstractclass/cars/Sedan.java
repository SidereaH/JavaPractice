package org.javapractice.sep26_abstractclass.cars;

public class Sedan extends Car{

    @Override
    public void gas() {
        System.out.println("vrooom!");
    }

    @Override
    public void stops() {
        System.out.println("pshhhhh....BOOM!");
    }
}
