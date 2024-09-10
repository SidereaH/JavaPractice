package org.javapractice.sep6.cars;

public class Truck {
    private int height;
    private int width;
    private int length;
    private int weight;
    private int volume;

    public Truck(int height, int width, int length, int weight){
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }
    public int getVolume(){
        this.volume = length * width * height;
        return this.volume;
    }
    public int getWeight(){
        return this.weight;
    }



}
