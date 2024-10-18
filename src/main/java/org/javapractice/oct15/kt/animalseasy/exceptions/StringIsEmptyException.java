package org.javapractice.oct15.kt.animalseasy.exceptions;

public class StringIsEmptyException extends Throwable {
    public StringIsEmptyException() {
        super("String cant be empty");
    }
}
