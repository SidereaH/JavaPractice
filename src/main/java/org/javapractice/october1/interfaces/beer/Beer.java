package org.javapractice.october1.interfaces.beer;

public class Beer implements Alcohol, Drinkable{
    public final boolean READY_TO_GO_HOME = false;
    private int health = 100;
    private int degree = 0;
    private float volumeOfCouple;
    private float volumeOfDrinked = 0;
    @Override
    public void drink() {
        volumeOfDrinked += volumeOfCouple;
        health -= (int) (degree*Alcohol.DAMAGE);
        System.out.printf("Drinks... Current volume of drinked %s litrofff. Current health: %d\n", volumeOfDrinked,health);

    }

    @Override
    public boolean isReadyToGoHome() {
        if (health<=0 || volumeOfDrinked>=1){
            System.out.println("Is ready to go home.\n");
            return true;
        }
        else{
            System.out.printf("No, we not end, current health: %d\n", health);
            return false;
        }
    }

    public Beer(float volumeOfCouple) {
        this.volumeOfCouple = volumeOfCouple;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public float getVolumeOfCouple() {
        return volumeOfCouple;
    }

    public void setVolumeOfCouple(float volumeOfCouple) {
        this.volumeOfCouple = volumeOfCouple;
    }

    public float getVolumeOfDrinked() {
        return volumeOfDrinked;
    }

    public void setVolumeOfDrinked(float volumeOfDrinked) {
        this.volumeOfDrinked = volumeOfDrinked;
    }
}
