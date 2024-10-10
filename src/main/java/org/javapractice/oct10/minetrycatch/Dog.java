package org.javapractice.oct10.minetrycatch;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public void putCollar() {
        System.out.println("Collar put on!");
        isCollarPutOn = true;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void putLeash() {
        System.out.println("Leash put on!");
        isLeashPutOn = true;
    }
    public void putMuzzle() {
        System.out.println("Muzzle put on!");
        isMuzzlePutOn = true;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void walk() throws DogIsNotreadyException {
        System.out.println("Getting to walking...");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Dog walks!");
        }
        else{
            throw new DogIsNotreadyException(String.format("Dog %s is not ready!", name));
        }
    }

}
