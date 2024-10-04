package org.javapractice.october4.nestedclasses.innerclasses;

public class Bicycle {
    private int seatPostDiametry;
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public Bicycle(String model) {
        this.model = model;
    }

    public Bicycle(int weight) {
        this.weight = weight;
    }
    public void start(){
        System.out.println("Goooo!!!");
    }
    public class Seat{
        public void up(){
            System.out.println("seat is up");
        }
        public void down(){
            System.out.println("seat is down");
        }
        public void getSeatParam(){
            System.out.printf("Параметр сидения: %s", Bicycle.this.seatPostDiametry);
        }
    }
    public class HandleBar{
        public void left(){
            System.out.println("bar left");
        }
        public void right(){
            System.out.println("bar right");
        }
    }
}
