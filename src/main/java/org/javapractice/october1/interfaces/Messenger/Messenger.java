package org.javapractice.october1.interfaces.Messenger;

public interface Messenger {
    public void sendMessage();
    public void getMessage();
    public default void sendHello() {
        System.out.println("Hello!");
    }
}
