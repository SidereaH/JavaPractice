package org.javapractice.sep6.cars;

public class BridgeOfficer {
    private int maxWeight;
    private int normalWeight;
    private String  name;
    private int age;
    private String rank;



    public BridgeOfficer(String name, int age, String rank, int maxWeight, int normalWeight){
        this.name = name;
        this.age = age;
        this.rank = rank;

        this.maxWeight = maxWeight;
        this.normalWeight = normalWeight;
    }
    public boolean checkTruck(Truck truck){
        return truck.getWeight() <= maxWeight;
    }
}
