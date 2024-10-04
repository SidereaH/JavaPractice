package org.javapractice.october1.interfaces.Messenger;

public class WhatsApp implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("WhatsApp sendMessage");
    }

    @Override
    public void getMessage() {
        System.out.println("WhatsApp getMessage");
    }
}
