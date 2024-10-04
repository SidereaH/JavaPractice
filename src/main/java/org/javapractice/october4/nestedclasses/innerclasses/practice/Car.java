package org.javapractice.october4.nestedclasses.innerclasses.practice;

public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public class Engine{
        private boolean isRunning;
        public void start(){
            System.out.println("Starting...");
            isRunning = true;
        }
        public void stop(){
            System.out.println("Stopping...");
            isRunning = false;
        }

    }
}
