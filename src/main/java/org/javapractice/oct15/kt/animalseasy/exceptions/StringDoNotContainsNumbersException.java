package org.javapractice.oct15.kt.animalseasy.exceptions;

public class StringDoNotContainsNumbersException extends Throwable {
    public StringDoNotContainsNumbersException() {
        super("String does not contain numbers");
    }
}
