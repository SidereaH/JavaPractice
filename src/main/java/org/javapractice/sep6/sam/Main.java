package org.javapractice.sep6.sam;

public class Main {
    public static void main(String[] args) {
        int moneyprim = 200;
        System.out.println("do: " + moneyprim);
        var bank = new BankSchet();
        bank.addMoney(moneyprim, 300);
        System.out.println("posle: " + moneyprim);

        var moneyobj = new Money(1000);
        System.out.println("obj do: " + moneyobj.money);
        bank.addMoney(moneyobj, 1500);
        System.out.println("obj posle: " + moneyobj.money);



    }
}
