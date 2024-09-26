package org.javapractice.sep26_abstractclass.practice.controlwork.factory;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }
}
