package org.javapractice.october1.interfaces.Messenger;

public class Telegram implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Send messsage");
    }

    @Override
    public void getMessage() {
        System.out.println("Get messsage");
    }


}
