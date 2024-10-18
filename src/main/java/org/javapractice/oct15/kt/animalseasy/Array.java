package org.javapractice.oct15.kt.animalseasy;

import java.util.IllegalFormatCodePointException;

public class Array {
    private Animal[] array;
    public Array(int size) {
        this.array = new Animal[size];
    }
    public void add(Animal animal) {
        int countels = -1;
        for (Animal element : array) {
            if (element != null) {
                countels++;
            }
        }
        if (countels == array.length - 1) {
            upgradeArray();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = animal;
                return;
            }
        }
    }
    private void upgradeArray(){
        Animal[] temp = this.array;
        int length = this.array.length;
        this.array = new Animal[length+5];
        for (int i = 0; i < temp.length; i++) {
            this.array[i] = temp[i];
        }
    }
    public Animal[] getArray(){
        return array;
    }
}
