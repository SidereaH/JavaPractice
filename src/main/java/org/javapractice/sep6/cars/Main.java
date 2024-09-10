package org.javapractice.sep6.cars;

public class Main {
    public static void main(String[] args) {
        Runnable firstTruck = () -> {
            var truck = new Truck(10,200, 300, 10000 );
            int truckVolume = truck.getVolume();
            System.out.println(truckVolume);
            var policeman = new BridgeOfficer("Albert", 36, "Major", 500, 1000);

            System.out.println("priem dayte proehat`");
            boolean canFirstTruckGo = policeman.checkTruck(truck);
            System.out.println(String.format("""
                        %s
                        """,
                    canFirstTruckGo
            ));
        };


        Runnable secondTruck = () -> {
            var policeman = new BridgeOfficer("Albert", 36, "Major", 500, 1000);
            var truck2 = new Truck(10,200, 300, 300 );
            System.out.println("priem dayte proehat` vtoromuu");
            boolean canFirstTruckGo2 = policeman.checkTruck(truck2);
            System.out.println(String.format("""
                        %s
                        """,
                    canFirstTruckGo2
            ));
        };
        new Thread(firstTruck).start();
        new Thread(secondTruck).start();


    }
}
