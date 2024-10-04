package org.javapractice.october1.interfaces.Messenger;

public class SmartPhone {
    private Application app;
    public SmartPhone() {
        this.app = new Telegram();
    }
}
