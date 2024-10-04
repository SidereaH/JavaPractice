package org.javapractice.october1.interfaces.Messenger;

public class Client {
    private Messenger messenger;
    public Client() {
        this.messenger = new Telegram();
    }
}
