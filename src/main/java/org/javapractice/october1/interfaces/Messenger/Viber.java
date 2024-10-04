package org.javapractice.october1.interfaces.Messenger;

public class Viber implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Send viber");
    }

    @Override
    public void getMessage() {
        System.out.println("Get in viber");
    }
}
