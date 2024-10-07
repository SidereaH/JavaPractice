package org.javapractice.october4.nestedclasses.innerclasses.practice;

public class Main {
    public static void main(String[] args) {
        var car = new Car();
        Car.Engine engine = car.new Engine();
        car.setEngine(engine);
        engine.start();
        engine.stop();

        //

        var outclass = new Outer();
        var inner =outclass.new Inner();
        var nestedclass = new Outer.Nested();

        //

        Pair pairOfNums = new Pair(4,16);
        var nod = pairOfNums.new Nod();
        //
        

    }

}
