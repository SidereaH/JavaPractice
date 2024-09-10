package org.javapractice.sep6.sam;

public class BankSchet {

    public void addMoney(int money, int howMuch){
        money+= howMuch;
    }
    public void addMoney(Money moneyobj, int howMuch){
        moneyobj.money += howMuch;
    }
}
