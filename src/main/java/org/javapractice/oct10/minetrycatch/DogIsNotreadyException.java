package org.javapractice.oct10.minetrycatch;

public class DogIsNotreadyException extends Throwable {
    public DogIsNotreadyException(String message) {
        super(message);
    }
}
